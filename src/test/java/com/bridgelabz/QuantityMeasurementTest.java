package com.bridgelabz;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class QuantityMeasurementTest {
    QuantityMeasurement quantityMeasurement;

    @Before
    public void setUp() {
        quantityMeasurement=new QuantityMeasurement();
    }

    @Test
    public void given0Feet_WhenComparedWithAnother0Feet_ShouldReturnTrue() {
        quantityMeasurement = new QuantityMeasurement(0,Unit.FEET_TO_INCH);
        boolean result = quantityMeasurement.equals(new QuantityMeasurement(0 ,Unit.FEET_TO_INCH));
        Assert.assertTrue(result);
    }

    @Test
    public void givenFeet_WhenComparedWithNullValue_ShouldReturnTrue() {
        quantityMeasurement = new QuantityMeasurement(0,Unit.FEET_TO_INCH);
        boolean result = quantityMeasurement.equals(null);
        Assert.assertTrue(result);
    }

    @Test
    public void givenFeetValue_WhenComparedByReference_ShouldReturnFalse() {
        quantityMeasurement = new QuantityMeasurement(0,Unit.FEET_TO_INCH);
        boolean result = quantityMeasurement.equals(new QuantityMeasurement(10,Unit.FEET_TO_INCH));
        Assert.assertFalse(result);
    }

    @Test
    public void givenFeetValue_WhenComparedByType_ShouldReturnTrue() {
        quantityMeasurement = new QuantityMeasurement(0,Unit.FEET_TO_INCH);
        boolean result = quantityMeasurement.equals(quantityMeasurement);
        Assert.assertTrue(result);
    }

    @Test
    public void givenFeet_WhenComparedByValue_ShouldReturnTrue() {
        quantityMeasurement = new QuantityMeasurement(0,Unit.FEET_TO_INCH);
        boolean result = quantityMeasurement.equals(new QuantityMeasurement(0,Unit.FEET_TO_INCH));
        Assert.assertTrue(result);
    }

    @Test
    public void givenFeet_WhenComparedByNegativeValue_ShouldReturnFalse() {
        quantityMeasurement = new QuantityMeasurement(-2.0,Unit.FEET_TO_INCH);
        boolean result = quantityMeasurement.equals(new QuantityMeasurement(0,Unit.FEET_TO_INCH));
        Assert.assertFalse(result);
    }

    @Test
    public void given0Inch_WhenComparedWithAnother0Inch_ShouldReturnTrue() {
        quantityMeasurement = new QuantityMeasurement(0,Unit.INCH_TO_FEET);
        boolean result = quantityMeasurement.equals(new QuantityMeasurement(0 ,Unit.INCH_TO_FEET));
        Assert.assertTrue(result);
    }

    @Test
    public void givenInch_WhenComparedWithNullValue_ShouldReturnTrue() {
        quantityMeasurement = new QuantityMeasurement(0,Unit.INCH_TO_FEET);
        boolean result = quantityMeasurement.equals(null);
        Assert.assertTrue(result);
    }

    @Test
    public void givenInchValue_WhenComparedByReference_ShouldReturnFalse() {
        quantityMeasurement = new QuantityMeasurement(0,Unit.INCH_TO_FEET);
        boolean result = quantityMeasurement.equals(new QuantityMeasurement(10,Unit.INCH_TO_FEET));
        Assert.assertFalse(result);
    }

    @Test
    public void givenInchValue_WhenComparedByType_ShouldReturnTrue() {
        quantityMeasurement = new QuantityMeasurement(0,Unit.INCH_TO_FEET);
        boolean result = quantityMeasurement.equals(quantityMeasurement);
        Assert.assertTrue(result);
    }

    @Test
    public void givenInch_WhenComparedByValue_ShouldReturnTrue() {
        quantityMeasurement = new QuantityMeasurement(0,Unit.INCH_TO_FEET);
        boolean result = quantityMeasurement.equals(new QuantityMeasurement(0,Unit.INCH_TO_FEET));
        Assert.assertTrue(result);
    }

    @Test
    public void givenInch_WhenComparedByNegativeValue_ShouldReturnFalse() {
        quantityMeasurement = new QuantityMeasurement(-5,Unit.INCH_TO_FEET);
        boolean result = quantityMeasurement.equals(new QuantityMeasurement(0,Unit.INCH_TO_FEET));
        Assert.assertFalse(result);
    }

    @Test
    public void given0Feet_WhenComparedBy0Inch_ShouldReturnTrue() {
        quantityMeasurement = new QuantityMeasurement(0,Unit.INCH_TO_FEET);
        boolean result = quantityMeasurement.equals(new QuantityMeasurement(0,Unit.FEET_TO_INCH));
        Assert.assertTrue(result);
    }

    @Test
    public void given1Feet_WhenComparedBy1Inch_ShouldReturnFalse() {
        QuantityMeasurement q1 = new QuantityMeasurement(1,Unit.FEET_TO_INCH);
        q1=quantityMeasurement.convertValue(q1,Unit.INCH_TO_FEET);
        boolean result = q1.equals(new QuantityMeasurement(1,Unit.INCH_TO_FEET));
        Assert.assertFalse(result);
    }

    @Test
    public void given1Inch_WhenComparedBy1Feet_ShouldReturnFalse() {
        QuantityMeasurement q1 = new QuantityMeasurement(1,Unit.INCH_TO_FEET);
        q1=quantityMeasurement.convertValue(q1,Unit.FEET_TO_INCH);
        boolean result = q1.equals(new QuantityMeasurement(1,Unit.FEET_TO_INCH));
        Assert.assertFalse(result);
    }

    @Test
    public void given1Feet_WhenComparedBy12Inch_ShouldReturnTrue() {
        QuantityMeasurement q1 = new QuantityMeasurement(1,Unit.FEET_TO_INCH);
        q1=quantityMeasurement.convertValue(q1,Unit.INCH_TO_FEET);
        boolean result = q1.equals(new QuantityMeasurement(12,Unit.INCH_TO_FEET));
        Assert.assertTrue(result);
    }

    @Test
    public void given12Inch_WhenComparedBy1Feet_ShouldReturnTrue() {
        QuantityMeasurement q1 = new QuantityMeasurement(12,Unit.INCH_TO_FEET);
        q1=quantityMeasurement.convertValue(q1,Unit.FEET_TO_INCH);
        boolean result = q1.equals(new QuantityMeasurement(1,Unit.FEET_TO_INCH));
        Assert.assertTrue(result);
    }
}
