package com.github.haydenk.SimUDuck;

import com.github.haydenk.SimUDuck.Behavior.FlyBehavior;
import com.github.haydenk.SimUDuck.Behavior.QuackBehavior;

public abstract class Duck {
    private FlyBehavior flyBehavior;
    private QuackBehavior quackBehavior;

    public Duck(FlyBehavior flyBehavior, QuackBehavior quackBehavior) {
        this.flyBehavior = flyBehavior;
        this.quackBehavior = quackBehavior;
    }

    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    public void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }

    public abstract String display();

    public String performQuack() {
        return quackBehavior.quack();
    }

    public String performFly() {
        return flyBehavior.fly();
    }
}
