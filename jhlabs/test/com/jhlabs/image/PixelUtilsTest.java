// Copyright by Barry G. Becker, 2012. Licensed under MIT License: http://www.opensource.org/licenses/MIT
package com.jhlabs.image;

import junit.framework.TestCase;

/**
 * test
 */
public class PixelUtilsTest extends TestCase {

    public void testBrightnessLow() {
        assertEquals("Unexpected brightness", 51, PixelUtils.brightness(0x223344));
    }

    public void testBrightnessHigh()  {
        assertEquals("Unexpected brightness", 215, PixelUtils.brightness(0xaaddff));
    }


}
