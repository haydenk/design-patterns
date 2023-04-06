package com.github.haydenk.SimUDuck.Behavior;

import junit.framework.TestCase;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class QuackBehaviorsTest extends TestCase {
    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][] {
                {null, new MuteQuack()},
                {"Quack!", new Quack()},
                {"Squeak", new Squeak()}
        });
    }
    @Parameterized.Parameter
    public String expectedOutput;

    @Parameterized.Parameter(1)
    public QuackBehavior behavior;

    @Test
    public void test() {
        assertEquals(expectedOutput, behavior.quack());
    }
}
