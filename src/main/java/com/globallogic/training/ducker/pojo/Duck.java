package com.globallogic.training.ducker.pojo;

public class Duck {
    private long duckId;
    private int age;
    private String color;
    private String name;
    private double weight;
    private double wingsLength;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getWingsLength() {
        return wingsLength;
    }

    public void setWingsLength(double wingsLength) {
        this.wingsLength = wingsLength;
    }

    @Override
    public String toString() {
        return "Duck{" +
                "duckId=" + duckId +
                ", age=" + age +
                ", color='" + color + '\'' +
                ", name='" + name + '\'' +
                ", weight=" + weight +
                ", wingsLength=" + wingsLength +
                '}';
    }
}
