package com.globallogic.training.ducker.pojo.decorator;

public class TagDuck implements DuckInterface {
    private DuckInterface duckInterface;
    private String tag;

    public TagDuck(DuckInterface duckInterface, String tag) {
        this.duckInterface = duckInterface;
        this.tag = tag;
    }

    @Override
    public String info() {
        return "Tag: " + tag;
    }
}
