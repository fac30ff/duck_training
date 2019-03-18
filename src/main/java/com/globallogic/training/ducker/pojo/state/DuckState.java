package com.globallogic.training.ducker.pojo.state;

import com.globallogic.training.ducker.exception.CannotProccedNewState;

import java.util.EnumSet;

public enum DuckState implements State{
    Sleeping{
        @Override
        DuckState setDuckState(DuckState duckState) throws CannotProccedNewState {
            if(possibilityToChangeState(possibleState(), this)) {
                return this;
            } else {
                throw new CannotProccedNewState();
            }
        }

        @Override
        EnumSet<DuckState> possibleState() {
            return EnumSet.of(DuckState.Standing);
        }
    },
    Flying{
        @Override
        DuckState setDuckState(DuckState duckState) throws CannotProccedNewState {
            if(possibilityToChangeState(possibleState(), this)) {
                return this;
            } else {
                throw new CannotProccedNewState();
            }
        }

        @Override
        EnumSet<DuckState> possibleState() {
            return EnumSet.of(DuckState.Running, DuckState.Swimming);
        }
    },
    Running{
        @Override
        DuckState setDuckState(DuckState duckState) throws CannotProccedNewState {
            if(possibilityToChangeState(possibleState(), this)) {
                return this;
            } else {
                throw new CannotProccedNewState();
            }
        }

        @Override
        EnumSet<DuckState> possibleState() {
            return EnumSet.of(DuckState.Walking, DuckState.Flying);
        }
    },
    Walking{
        @Override
        DuckState setDuckState(DuckState duckState) throws CannotProccedNewState {
            if(possibilityToChangeState(possibleState(), this)) {
                return this;
            } else {
                throw new CannotProccedNewState();
            }
        }

        @Override
        EnumSet<DuckState> possibleState() {
            return EnumSet.of(DuckState.Swimming, DuckState.Running);
        }
    },
    Swimming{
        @Override
        DuckState setDuckState(DuckState duckState) throws CannotProccedNewState {
            if(possibilityToChangeState(possibleState(), this)) {
                return this;
            } else {
                throw new CannotProccedNewState();
            }
        }

        @Override
        EnumSet<DuckState> possibleState() {
            return EnumSet.of(DuckState.Flying, DuckState.Walking, DuckState.Standing);
        }
    },
    Eating{
        @Override
        DuckState setDuckState(DuckState duckState) throws CannotProccedNewState {
            if(possibilityToChangeState(possibleState(), this)) {
                return this;
            } else {
                throw new CannotProccedNewState();
            }
        }

        @Override
        EnumSet<DuckState> possibleState() {
            return EnumSet.of(DuckState.Standing);
        }
    },
    Standing{
        @Override
        DuckState setDuckState(DuckState duckState) throws CannotProccedNewState {
            if(possibilityToChangeState(possibleState(), this)) {
                return this;
            } else {
                throw new CannotProccedNewState();
            }
        }

        @Override
        EnumSet<DuckState> possibleState() {
            return EnumSet.of(DuckState.Swimming, DuckState.Sleeping, DuckState.Standing, DuckState.Eating);
        }
    };

    abstract DuckState setDuckState(DuckState duckState) throws CannotProccedNewState;

    abstract EnumSet<DuckState> possibleState();

    boolean possibilityToChangeState(EnumSet<DuckState> duckStates, DuckState duckState) {
        return duckStates.contains(duckState);
    }
}

