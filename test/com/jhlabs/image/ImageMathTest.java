// Copyright by Barry G. Becker, 2012. Licensed under MIT License: http://www.opensource.org/licenses/MIT
package com.jhlabs.image;

import junit.framework.TestCase;

/**
 * test
 */
public class ImageMathTest extends TestCase {

    public void testBias1() {
        assertEquals("Unexpected bias", 1.0f, ImageMath.bias(1, 2));
    }

    public void testBias2()  {
        assertEquals("Unexpected bias", -0.0f, ImageMath.bias(0, 2));
    }

    public void testBias3() {
        assertEquals("Unexpected bias", -0.0f, ImageMath.bias(3, 0));
    }

    public void testBias4() {
        assertEquals("Unexpected bias", 0.54545456f, ImageMath.bias(11, 12));
    }


    public void testGain1() {
        assertEquals("Unexpected gain", 0.75f, ImageMath.gain(2, 3));
    }

    public void testGain2()  {
        assertEquals("Unexpected gain", 0.6923077f, ImageMath.gain(3, 2));
    }

}
