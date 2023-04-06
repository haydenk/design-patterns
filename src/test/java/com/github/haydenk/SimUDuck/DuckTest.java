package com.github.haydenk.SimUDuck;

import com.github.haydenk.SimUDuck.Behavior.FlyBehavior;
import com.github.haydenk.SimUDuck.Behavior.FlyNoWay;
import com.github.haydenk.SimUDuck.Behavior.FlyWithWings;
import junit.framework.TestCase;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class DuckTest extends TestCase {
    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][] {
                {"I'm flying!", "Quack!", "I'm a real Mallard duck.", new Mallard()}
        });
    }

    @Parameterized.Parameter
    public String expectedFlyOutput;

    @Parameterized.Parameter(1)
    public String expectedQuackOutput;

    @Parameterized.Parameter(2)
    public String expectedDisplay;

    @Parameterized.Parameter(3)
    public Duck duck;

    @Test
    public void test() {
        assertEquals(expectedFlyOutput, duck.performFly());
        assertEquals(expectedQuackOutput, duck.performQuack());
        assertEquals(expectedDisplay, duck.display());
    }
}