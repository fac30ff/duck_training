package com.globallogic.training.ducker.pojo.builder;

import com.globallogic.training.ducker.pojo.Duck;

import java.util.Random;

public class DuckBuilder<SELF extends DuckBuilder<SELF>> {
  private Duck duck = new Duck();

  private SELF self() {
    return (SELF)this;
  }

  public SELF withName(String name) {
    duck.setName(name);
    return self();
  }

  public SELF withAge(int age) {
    duck.setAge(age);
    return self();
  }

  public SELF withWeight(double weight) {
    if(duck.getWingsLength() == 0.0) {
      duck.setWeight(weight);
      duck.setWingsLength(weight/4);
    } else {
      duck.setWeight(duck.getWingsLength()*4);

    }
    return self();
  }

  public SELF withWingsLength(double wingsLength) {
    if(duck.getWeight() == 0) {
      duck.setWingsLength(wingsLength);
      duck.setWeight(wingsLength*4);
    } else {
      duck.setWingsLength(duck.getWeight()/4);
    }
    return self();
  }

  public SELF withColor(String color) {
    if(duck.getAge() == 0) {
      switch (color.toLowerCase()) {
        case "yellow":
          duck.setColor(color);
          duck.setAge(1);
          break;
        case "brown":
          duck.setColor(color);
          duck.setAge(new Random().nextInt(6));
          break;
        case "gold":
          duck.setColor(color);
          duck.setAge(new Random().nextInt(11));
          break;
        case "white":
          duck.setColor(color);
          duck.setAge(1);
          break;
      }
    }
    return self();
  }

  private int setRandomNumber() {

  }
}
