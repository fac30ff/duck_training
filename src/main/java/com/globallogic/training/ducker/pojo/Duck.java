package com.globallogic.training.ducker.pojo;

import com.globallogic.training.ducker.pojo.decorator.DuckInterface;
import com.globallogic.training.ducker.pojo.state.DuckState;

public class Duck implements Cloneable, DuckInterface {
    private long duckId;
    private int age;
    private String color;
    private String name;
    private double weight;
    private double wingsLength;
    private DuckState duckState = DuckState.Standing;

    public long getDuckId() {
        return duckId;
    }

    public DuckState getDuckState() {
        return duckState;
    }

    public void setDuckState(DuckState duckState) {
        this.duckState = duckState;
    }

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

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String info() {
        return this.toString();
    }
}
