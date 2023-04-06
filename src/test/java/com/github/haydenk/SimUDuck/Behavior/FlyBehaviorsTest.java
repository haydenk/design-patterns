package com.github.haydenk.SimUDuck.Behavior;

import junit.framework.TestCase;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class FlyBehaviorsTest extends TestCase {
    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][] {
                {null, new FlyNoWay()},
                {"I'm flying!", new FlyWithWings()}
        });
    }

    @Parameterized.Parameter
    public String expectedOutput;

    @Parameterized.Parameter(1)
    public FlyBehavior behavior;

    @Test
    public void test() {
        assertEquals(expectedOutput, behavior.fly());
    }
}
