package com.github.haydenk.SimUDuck;

import com.github.haydenk.SimUDuck.Behavior.FlyWithWings;
import com.github.haydenk.SimUDuck.Behavior.Quack;

public class Mallard extends Duck {
    public Mallard() {
        super(new FlyWithWings(), new Quack());
    }

    @Override
    public String display() {
        return "I'm a real Mallard duck.";
    }
}
