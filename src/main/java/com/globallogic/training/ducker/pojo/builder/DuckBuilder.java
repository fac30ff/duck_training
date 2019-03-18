package com.globallogic.training.ducker.pojo.builder;

import com.globallogic.training.ducker.exception.NoSuchColorException;
import com.globallogic.training.ducker.pojo.Duck;

import java.lang.reflect.Field;
import java.util.Random;

public class DuckBuilder<SELF extends DuckBuilder<SELF>> {
    private Duck duck = new Duck();
    private static long ID;

    private SELF self() {
        return (SELF) this;
    }


    public SELF withName(String name) {
        duck.setName(name);
        return self();
    }

    public SELF withAge(int age) throws NoSuchColorException {
        if (duck.getColor() == null) {
            duck.setAge(age);
        } else {
            String color = duck.getColor();
            setAgeAccordingToColor(color);
        }
        return self();
    }

    private void setAgeAccordingToColor(String color) throws NoSuchColorException {
        switch (color.toLowerCase()) {
            case "yellow":
                duck.setColor(color);
                duck.setAge(1);
                break;
            case "brown":
                duck.setColor(color);
                duck.setAge(setRandomNumber(2, 5));
                break;
            case "gold":
                duck.setColor(color);
                duck.setAge(setRandomNumber(6, 10));
                break;
            case "white":
                duck.setColor(color);
                duck.setAge(setRandomNumber(11, Integer.MAX_VALUE - 12));
                break;
            default:
                throw new NoSuchColorException();
        }
    }

    public SELF withWeight(double weight) {
        if (duck.getWingsLength() == 0.0) {
            duck.setWeight(weight);
            duck.setWingsLength(weight / 4);
        } else {
            duck.setWeight(duck.getWingsLength() * 4);

        }
        return self();
    }

    public SELF withWingsLength(double wingsLength) {
        if (duck.getWeight() == 0) {
            duck.setWingsLength(wingsLength);
            duck.setWeight(wingsLength * 4);
        } else {
            duck.setWingsLength(duck.getWeight() / 4);
        }
        return self();
    }

    public SELF withColor(String color) throws NoSuchColorException {
        if (duck.getAge() == 0) {
            setAgeAccordingToColor(color);
        } else {
            int i = duck.getAge();
            if (i < 2) {
                duck.setColor("yellow");
            }
            if (i > 2 && i < 6) {
                duck.setColor("brown");
            }
            if (i > 6 && i < 11) {
                duck.setColor("gold");
            }
            if (i > 10) {
                duck.setColor("white");
            }
        }
        return self();
    }

    public Duck build() throws IllegalAccessException, NoSuchFieldException {
        ID += 1L;
        Field id = Duck.class.getDeclaredField("duckId");
        id.setAccessible(true);
        id.set(this, ID);
        return this.duck;
    }

    private int setRandomNumber(int min, int max) {
        if (min > max || max - min + 1 > Integer.MAX_VALUE) {
            throw new IllegalArgumentException("Invalid range");
        }
        return new Random().nextInt(max - min + 1) + min;
    }

}
