package com.bridgelabz;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class QuantityMeasurementTest {
    QuantityMeasurement quantityMeasurement;
    @Before
    public void setUp() {
        quantityMeasurement=new QuantityMeasurement();
        quantityMeasurement.setOperation(new Length());
    }

    @Test
    public void given0Feet_WhenComparedWithAnother0Feet_ShouldReturnTrue() {
        quantityMeasurement = new QuantityMeasurement(0,Unit.FEET);
        boolean result = quantityMeasurement.equals(new QuantityMeasurement(0 , Unit.FEET));
        Assert.assertTrue(result);
    }

    @Test
    public void givenFeet_WhenComparedWithNullValue_ShouldReturnTrue() {
        quantityMeasurement = new QuantityMeasurement(0, Unit.FEET);
        boolean result = quantityMeasurement.equals(null);
        Assert.assertTrue(result);
    }

    @Test
    public void givenFeetValue_WhenComparedByReference_ShouldReturnFalse() {
        quantityMeasurement = new QuantityMeasurement(0,Unit.FEET);
        boolean result = quantityMeasurement.equals(new QuantityMeasurement(10,Unit.FEET));
        Assert.assertFalse(result);
    }

    @Test
    public void givenFeetValue_WhenComparedByType_ShouldReturnTrue() {
        quantityMeasurement = new QuantityMeasurement(0,Unit.FEET);
        boolean result = quantityMeasurement.equals(quantityMeasurement);
        Assert.assertTrue(result);
    }

    @Test
    public void givenFeet_WhenComparedByValue_ShouldReturnTrue() {
        quantityMeasurement = new QuantityMeasurement(0,Unit.FEET);
        boolean result = quantityMeasurement.equals(new QuantityMeasurement(0,Unit.FEET));
        Assert.assertTrue(result);
    }

    @Test
    public void givenFeet_WhenComparedByNegativeValue_ShouldReturnFalse() {
        quantityMeasurement = new QuantityMeasurement(-2.0,Unit.FEET);
        boolean result = quantityMeasurement.equals(new QuantityMeasurement(0,Unit.FEET));
        Assert.assertFalse(result);
    }

    @Test
    public void given0Inch_WhenComparedWithAnother0Inch_ShouldReturnTrue() {
        quantityMeasurement = new QuantityMeasurement(0,Unit.INCH);
        boolean result = quantityMeasurement.equals(new QuantityMeasurement(0 ,Unit.INCH));
        Assert.assertTrue(result);
    }

    @Test
    public void givenInch_WhenComparedWithNullValue_ShouldReturnTrue() {
        quantityMeasurement = new QuantityMeasurement(0,Unit.INCH);
        boolean result = quantityMeasurement.equals(null);
        Assert.assertTrue(result);
    }

    @Test
    public void givenInchValue_WhenComparedByReference_ShouldReturnFalse() {
        quantityMeasurement = new QuantityMeasurement(0,Unit.INCH);
        boolean result = quantityMeasurement.equals(new QuantityMeasurement(10,Unit.INCH));
        Assert.assertFalse(result);
    }

    @Test
    public void givenInchValue_WhenComparedByType_ShouldReturnTrue() {
        quantityMeasurement = new QuantityMeasurement(0,Unit.INCH);
        boolean result = quantityMeasurement.equals(quantityMeasurement);
        Assert.assertTrue(result);
    }

    @Test
    public void givenInch_WhenComparedByValue_ShouldReturnTrue() {
        quantityMeasurement = new QuantityMeasurement(0,Unit.INCH);
        boolean result = quantityMeasurement.equals(new QuantityMeasurement(0,Unit.INCH));
        Assert.assertTrue(result);
    }

    @Test
    public void givenInch_WhenComparedByNegativeValue_ShouldReturnFalse() {
        quantityMeasurement = new QuantityMeasurement(-5,Unit.INCH);
        boolean result = quantityMeasurement.equals(new QuantityMeasurement(0,Unit.INCH));
        Assert.assertFalse(result);
    }

    @Test
    public void given0Feet_WhenComparedBy0Inch_ShouldReturnTrue() {
        quantityMeasurement = new QuantityMeasurement(0,Unit.INCH);
        boolean result = quantityMeasurement.equals(new QuantityMeasurement(0,Unit.FEET));
        Assert.assertTrue(result);
    }

    @Test
    public void given1Feet_WhenComparedBy1Inch_ShouldReturnFalse() {
        boolean result = quantityMeasurement.compare(new QuantityMeasurement(1,Unit.FEET),new QuantityMeasurement(1,Unit.INCH));
        Assert.assertFalse(result);
    }

    @Test
    public void given1Inch_WhenComparedBy1Feet_ShouldReturnFalse() {
        boolean result = quantityMeasurement.compare(new QuantityMeasurement(1, Unit.INCH),new QuantityMeasurement(1,Unit.FEET));
        Assert.assertFalse(result);
    }

    @Test
    public void given1Feet_WhenComparedBy12Inch_ShouldReturnTrue() {
        boolean result = quantityMeasurement.compare(new QuantityMeasurement(1,Unit.FEET),new QuantityMeasurement(12,Unit.INCH));
        Assert.assertTrue(result);
    }

    @Test
    public void given12Inch_WhenComparedBy1Feet_ShouldReturnTrue() {
        boolean result = quantityMeasurement.compare(new QuantityMeasurement(12,Unit.INCH),new QuantityMeasurement(1,Unit.FEET));
        Assert.assertTrue(result);
    }

    @Test
    public void given3Feet_WhenComparedBy1Yard_ShouldReturnTrue() {
        boolean result = quantityMeasurement.compare(new QuantityMeasurement(3,Unit.FEET),new QuantityMeasurement(1,Unit.YARD));
        Assert.assertTrue(result);
    }

    @Test
    public void given1Feet_WhenComparedBy1Yard_ShouldReturnFalse() {
        boolean result = quantityMeasurement.compare(new QuantityMeasurement(1,Unit.FEET),new QuantityMeasurement(1,Unit.YARD));
        Assert.assertFalse(result);
    }

    @Test
    public void given1Inch_WhenComparedBy1Yard_ShouldReturnFalse() {
        boolean result = quantityMeasurement.compare(new QuantityMeasurement(1,Unit.INCH),new QuantityMeasurement(1,Unit.YARD));
        Assert.assertFalse(result);
    }

    @Test
    public void given1Yard_WhenComparedBy36Inch_ShouldReturnTrue() {
        boolean result = quantityMeasurement.compare(new QuantityMeasurement(1,Unit.YARD),new QuantityMeasurement(36,Unit.INCH));
        Assert.assertTrue(result);
    }

    @Test
    public void given36Inch_WhenComparedBy1Yard_ShouldReturnTrue() {
        boolean result = quantityMeasurement.compare(new QuantityMeasurement(36,Unit.INCH),new QuantityMeasurement(1,Unit.YARD));
        Assert.assertTrue(result);
    }

    @Test
    public void given1Yard_WhenComparedBy3Feet_ShouldReturnTrue() {
        boolean result = quantityMeasurement.compare(new QuantityMeasurement(1,Unit.YARD),new QuantityMeasurement(3,Unit.FEET));
        Assert.assertTrue(result);
    }

    @Test
    public void given2Inch_WhenComparedBy5Centimeter_ShouldReturnTrue() {
        boolean result = quantityMeasurement.compare(new QuantityMeasurement(2,Unit.INCH),new QuantityMeasurement(5.08,Unit.CENTIMETER));
        Assert.assertTrue(result);
    }

    @Test
    public void givenTwoLengths_WhenAdded_ShouldReturn_4Inch() {
        double total=quantityMeasurement.getTotal(new QuantityMeasurement(2,Unit.INCH),new QuantityMeasurement(2,Unit.INCH));
        Assert.assertEquals(4, total,0.0);
    }

    @Test
    public void givenTwoLengths_WhenAdded_ShouldReturn_14Inch() {
        double total=quantityMeasurement.getTotal(new QuantityMeasurement(1,Unit.FEET),new QuantityMeasurement(2,Unit.INCH));
        Assert.assertEquals(14, total,0.0);
    }

    @Test
    public void givenTwoLengths_WhenAdded_ShouldReturn_24Inch() {
        double total=quantityMeasurement.getTotal(new QuantityMeasurement(1,Unit.FEET),new QuantityMeasurement(1,Unit.FEET));
		Assert.assertEquals(24, total,0.0);
    }

    @Test
    public void givenTwoLengths_WhenAdded_ShouldReturn_3Inch() {
        double total=quantityMeasurement.getTotal(new QuantityMeasurement(2,Unit.INCH),new QuantityMeasurement(2.5,Unit.CENTIMETER));
        Assert.assertEquals(2.98, total,0.0);
    }

    @Test
    public void given1Gallon_WhenComparedByLitre_ShouldReturnTrue() {
        boolean result = quantityMeasurement.compare(new QuantityMeasurement(1,Unit.GALLON),new QuantityMeasurement(3.78,Unit.LITRE));
        Assert.assertTrue(result);
    }

    @Test
    public void given1Litre_WhenComparedBy1000MilliLitre_ShouldReturnTrue() {
        boolean result = quantityMeasurement.compare(new QuantityMeasurement(1,Unit.LITRE),new QuantityMeasurement(1000,Unit.MILLILITRE));
        Assert.assertTrue(result);
    }

    @Test
    public void givenTwoVolumes_WhenAdded_ShouldReturnLitre() {
        double total=quantityMeasurement.getTotal(new QuantityMeasurement(1,Unit.GALLON),new QuantityMeasurement(3.78,Unit.LITRE));
        Assert.assertEquals(7.56, total,0.0);
    }

    @Test
    public void givenTwoVolumes_WhenAdded_ShouldReturn2Litre() {
        double total=quantityMeasurement.getTotal(new QuantityMeasurement(1,Unit.LITRE),new QuantityMeasurement(1000,Unit.MILLILITRE));
        Assert.assertEquals(2, total,0.0);
    }

    @Test
    public void given1Kilogram_WhenComparedBy1000Gram_ShouldReturnTrue() {
        boolean result = quantityMeasurement.compare(new QuantityMeasurement(1,Unit.KILOGRAM),new QuantityMeasurement(1000,Unit.GRAM));
        Assert.assertTrue(result);
    }

    @Test
    public void given1Tonne_WhenComparedBy1000Kilogram_ShouldReturnTrue() {
        boolean result = quantityMeasurement.compare(new QuantityMeasurement(1,Unit.TONNE),new QuantityMeasurement(1000,Unit.KILOGRAM));
        Assert.assertTrue(result);
    }

    @Test
    public void givenTwoWeights_WhenAdded_ShouldReturn_1001Kilogram() {
        double total = quantityMeasurement.getTotal(new QuantityMeasurement(1,Unit.TONNE),new QuantityMeasurement(1000,Unit.GRAM));
        Assert.assertEquals(1001, total,0.0);
    }

    @Test
    public void given212Fahrenheit_WhenComparedBy100Celsius_ShouldReturnTrue() {
        quantityMeasurement.setOperation(new Temperature());
        boolean result = quantityMeasurement.compare(new QuantityMeasurement(90,Unit.FAHRENHEIT),new QuantityMeasurement(32.22,Unit.CELSIUS));
        Assert.assertTrue(result);
    }
}
