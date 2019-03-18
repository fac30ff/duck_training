package com.globallogic.training.ducker.pojo.decorator;

import java.util.ArrayList;
import java.util.List;

public class ChainletDuck implements DuckInterface {
    private DuckInterface duckInterface;
    private List<DuckInterface> chainlet = new ArrayList<>();

    public ChainletDuck(DuckInterface duckInterface) {
        this.duckInterface = duckInterface;
        this.chainlet.add(duckInterface);
    }

    @Override
    public String info() {
        for (DuckInterface duck : chainlet) {
            return "chainlet contains :" + duck;
        }
        return "\n";
    }
}
