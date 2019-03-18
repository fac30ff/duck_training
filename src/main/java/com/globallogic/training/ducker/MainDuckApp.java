package com.globallogic.training.ducker;

import com.globallogic.training.ducker.exception.NoSuchColorException;
import com.globallogic.training.ducker.pojo.Duck;
import com.globallogic.training.ducker.pojo.builder.DuckBuilder;
import com.globallogic.training.ducker.pojo.decorator.ChainletDuck;
import com.globallogic.training.ducker.pojo.decorator.DuckInterface;
import com.globallogic.training.ducker.pojo.decorator.TagDuck;

public class MainDuckApp {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException, NoSuchColorException {
        DuckBuilder builder = new DuckBuilder();
        Duck duck = builder.withName("a")
                .withAge(3)
                .withWeight(7)
                .build();

        DuckInterface chainDuck = new ChainletDuck(duck);
        DuckInterface tagedDuck = new TagDuck(chainDuck, "taged");
        tagedDuck.info();

    }
}
