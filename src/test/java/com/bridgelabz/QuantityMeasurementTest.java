package com.bridgelabz;


import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class QuantityMeasurementTest {
    QuantityMeasurement quantityMeasurement;
    @Before
    public void setUp() throws Exception {
        quantityMeasurement = new QuantityMeasurement();
    }

    @Test
    public void given0Feet_WhenComparedWith0Feet_ShouldReturnEqual() {
        boolean result = quantityMeasurement.compareLength(0, 0);
        Assert.assertTrue(result);
    }
}
