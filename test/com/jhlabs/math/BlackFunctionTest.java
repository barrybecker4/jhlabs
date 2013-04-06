// Copyright by Barry G. Becker, 2012. Licensed under MIT License: http://www.opensource.org/licenses/MIT
package com.jhlabs.math;

import junit.framework.TestCase;

/**
 * test
 */
public class BlackFunctionTest extends TestCase {

    /** instance under test */
    private BlackFunction function;

    public void testIsBlackWhenNot() {
        function = new BlackFunction();

        assertFalse("Unexpectedly black", function.isBlack(0x11223344));
    }

    public void testIsBlackWhenTransparentBlack() {
        function = new BlackFunction();

        assertFalse("Unexpectedly black", function.isBlack(0x00000000));
    }

    public void testIsBlackWhenItIs() {
        function = new BlackFunction();

        assertTrue("Unexpectedly not black", function.isBlack(0xff000000));
    }
}
