package com.bridgelabz;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class QuantityMeasurementTest {
    QuantityMeasurement quantityMeasurement;
    @Before
    public void setUp() {
        quantityMeasurement=new QuantityMeasurement();
        quantityMeasurement.setMeasure(new Length());
    }

    @Test
    public void given0Feet_WhenComparedWithAnother0Feet_ShouldReturnTrue() {
        quantityMeasurement = new QuantityMeasurement(0,Unit.FEET,UnitType.LENGTH);
        boolean result = quantityMeasurement.equals(new QuantityMeasurement(0 , Unit.FEET,UnitType.LENGTH));
        Assert.assertTrue(result);
    }

    @Test
    public void givenFeet_WhenComparedWithNullValue_ShouldReturnTrue() {
        quantityMeasurement = new QuantityMeasurement(0, Unit.FEET,UnitType.LENGTH);
        boolean result = quantityMeasurement.equals(null);
        Assert.assertTrue(result);
    }

    @Test
    public void givenFeetValue_WhenComparedByReference_ShouldReturnFalse() {
        quantityMeasurement = new QuantityMeasurement(0,Unit.FEET,UnitType.LENGTH);
        boolean result = quantityMeasurement.equals(new QuantityMeasurement(10,Unit.FEET,UnitType.LENGTH));
        Assert.assertFalse(result);
    }

    @Test
    public void givenFeetValue_WhenComparedByType_ShouldReturnTrue() {
        quantityMeasurement = new QuantityMeasurement(0,Unit.FEET,UnitType.LENGTH);
        boolean result = quantityMeasurement.equals(quantityMeasurement);
        Assert.assertTrue(result);
    }

    @Test
    public void givenFeet_WhenComparedByValue_ShouldReturnTrue() {
        quantityMeasurement = new QuantityMeasurement(0,Unit.FEET,UnitType.LENGTH);
        boolean result = quantityMeasurement.equals(new QuantityMeasurement(0,Unit.FEET,UnitType.LENGTH));
        Assert.assertTrue(result);
    }

    @Test
    public void givenFeet_WhenComparedByNegativeValue_ShouldReturnFalse() {
        quantityMeasurement = new QuantityMeasurement(-2.0,Unit.FEET,UnitType.LENGTH);
        boolean result = quantityMeasurement.equals(new QuantityMeasurement(0,Unit.FEET,UnitType.LENGTH));
        Assert.assertFalse(result);
    }

    @Test
    public void given0Inch_WhenComparedWithAnother0Inch_ShouldReturnTrue() {
        quantityMeasurement = new QuantityMeasurement(0,Unit.INCH,UnitType.LENGTH);
        boolean result = quantityMeasurement.equals(new QuantityMeasurement(0 ,Unit.INCH,UnitType.LENGTH));
        Assert.assertTrue(result);
    }

    @Test
    public void givenInch_WhenComparedWithNullValue_ShouldReturnTrue() {
        quantityMeasurement = new QuantityMeasurement(0,Unit.INCH,UnitType.LENGTH);
        boolean result = quantityMeasurement.equals(null);
        Assert.assertTrue(result);
    }

    @Test
    public void givenInchValue_WhenComparedByReference_ShouldReturnFalse() {
        quantityMeasurement = new QuantityMeasurement(0,Unit.INCH,UnitType.LENGTH);
        boolean result = quantityMeasurement.equals(new QuantityMeasurement(10,Unit.INCH,UnitType.LENGTH));
        Assert.assertFalse(result);
    }

    @Test
    public void givenInchValue_WhenComparedByType_ShouldReturnTrue() {
        quantityMeasurement = new QuantityMeasurement(0,Unit.INCH,UnitType.LENGTH);
        boolean result = quantityMeasurement.equals(quantityMeasurement);
        Assert.assertTrue(result);
    }

    @Test
    public void givenInch_WhenComparedByValue_ShouldReturnTrue() {
        quantityMeasurement = new QuantityMeasurement(0,Unit.INCH,UnitType.LENGTH);
        boolean result = quantityMeasurement.equals(new QuantityMeasurement(0,Unit.INCH,UnitType.LENGTH));
        Assert.assertTrue(result);
    }

    @Test
    public void givenInch_WhenComparedByNegativeValue_ShouldReturnFalse() {
        quantityMeasurement = new QuantityMeasurement(-5,Unit.INCH,UnitType.LENGTH);
        boolean result = quantityMeasurement.equals(new QuantityMeasurement(0,Unit.INCH,UnitType.LENGTH));
        Assert.assertFalse(result);
    }

    @Test
    public void given0Feet_WhenComparedBy0Inch_ShouldReturnTrue() {
        quantityMeasurement = new QuantityMeasurement(0,Unit.INCH,UnitType.LENGTH);
        boolean result = quantityMeasurement.equals(new QuantityMeasurement(0,Unit.FEET,UnitType.LENGTH));
        Assert.assertTrue(result);
    }

    @Test
    public void given1Feet_WhenComparedBy1Inch_ShouldReturnFalse() {
        boolean result = quantityMeasurement.compare(new QuantityMeasurement(1,Unit.FEET,UnitType.LENGTH),new QuantityMeasurement(1,Unit.INCH,UnitType.LENGTH));
        Assert.assertFalse(result);
    }

    @Test
    public void given1Inch_WhenComparedBy1Feet_ShouldReturnFalse() {
        boolean result = quantityMeasurement.compare(new QuantityMeasurement(1, Unit.INCH,UnitType.LENGTH),new QuantityMeasurement(1,Unit.FEET,UnitType.LENGTH));
        Assert.assertFalse(result);
    }

    @Test
    public void given1Feet_WhenComparedBy12Inch_ShouldReturnTrue() {
        boolean result = quantityMeasurement.compare(new QuantityMeasurement(1,Unit.FEET,UnitType.LENGTH),new QuantityMeasurement(12,Unit.INCH,UnitType.LENGTH));
        Assert.assertTrue(result);
    }

    @Test
    public void given12Inch_WhenComparedBy1Feet_ShouldReturnTrue() {
        boolean result = quantityMeasurement.compare(new QuantityMeasurement(12,Unit.INCH,UnitType.LENGTH),new QuantityMeasurement(1,Unit.FEET,UnitType.LENGTH));
        Assert.assertTrue(result);
    }

    @Test
    public void given3Feet_WhenComparedBy1Yard_ShouldReturnTrue() {
        boolean result = quantityMeasurement.compare(new QuantityMeasurement(3,Unit.FEET,UnitType.LENGTH),new QuantityMeasurement(1,Unit.YARD,UnitType.LENGTH));
        Assert.assertTrue(result);
    }

    @Test
    public void given1Feet_WhenComparedBy1Yard_ShouldReturnFalse() {
        boolean result = quantityMeasurement.compare(new QuantityMeasurement(1,Unit.FEET,UnitType.LENGTH),new QuantityMeasurement(1,Unit.YARD,UnitType.LENGTH));
        Assert.assertFalse(result);
    }

    @Test
    public void given1Inch_WhenComparedBy1Yard_ShouldReturnFalse() {
        boolean result = quantityMeasurement.compare(new QuantityMeasurement(1,Unit.INCH,UnitType.LENGTH),new QuantityMeasurement(1,Unit.YARD,UnitType.LENGTH));
        Assert.assertFalse(result);
    }

    @Test
    public void given1Yard_WhenComparedBy36Inch_ShouldReturnTrue() {
        boolean result = quantityMeasurement.compare(new QuantityMeasurement(1,Unit.YARD,UnitType.LENGTH),new QuantityMeasurement(36,Unit.INCH,UnitType.LENGTH));
        Assert.assertTrue(result);
    }

    @Test
    public void given36Inch_WhenComparedBy1Yard_ShouldReturnTrue() {
        boolean result = quantityMeasurement.compare(new QuantityMeasurement(36,Unit.INCH,UnitType.LENGTH),new QuantityMeasurement(1,Unit.YARD,UnitType.LENGTH));
        Assert.assertTrue(result);
    }

    @Test
    public void given1Yard_WhenComparedBy3Feet_ShouldReturnTrue() {
        boolean result = quantityMeasurement.compare(new QuantityMeasurement(1,Unit.YARD,UnitType.LENGTH),new QuantityMeasurement(3,Unit.FEET,UnitType.LENGTH));
        Assert.assertTrue(result);
    }

    @Test
    public void given2Inch_WhenComparedBy5Centimeter_ShouldReturnTrue() {
        boolean result = quantityMeasurement.compare(new QuantityMeasurement(2,Unit.INCH,UnitType.LENGTH),new QuantityMeasurement(5.08,Unit.CENTIMETER,UnitType.LENGTH));
        Assert.assertTrue(result);
    }

    @Test
    public void givenTwoLengths_WhenAdded_ShouldReturn_4Inch() {
        double total=quantityMeasurement.getTotal(new QuantityMeasurement(2,Unit.INCH,UnitType.LENGTH),new QuantityMeasurement(2,Unit.INCH,UnitType.LENGTH));
        Assert.assertEquals(4, total,0.0);
    }

    @Test
    public void givenTwoLengths_WhenAdded_ShouldReturn_14Inch() {
        double total=quantityMeasurement.getTotal(new QuantityMeasurement(1,Unit.FEET,UnitType.LENGTH),new QuantityMeasurement(2,Unit.INCH,UnitType.LENGTH));
        Assert.assertEquals(14, total,0.0);
    }

    @Test
    public void givenTwoLengths_WhenAdded_ShouldReturn_24Inch() {
        double total=quantityMeasurement.getTotal(new QuantityMeasurement(1,Unit.FEET,UnitType.LENGTH),new QuantityMeasurement(1,Unit.FEET,UnitType.LENGTH));
		Assert.assertEquals(24, total,0.0);
    }

    @Test
    public void givenTwoLengths_WhenAdded_ShouldReturn_3Inch() {
        double total=quantityMeasurement.getTotal(new QuantityMeasurement(2,Unit.INCH,UnitType.LENGTH),new QuantityMeasurement(2.5,Unit.CENTIMETER,UnitType.LENGTH));
        Assert.assertEquals(2.98, total,0.0);
    }

    @Test
    public void given1Gallon_WhenComparedByLitre_ShouldReturnTrue() {
        quantityMeasurement.setMeasure(new Volume());
        boolean result = quantityMeasurement.compare(new QuantityMeasurement(1,Unit.GALLON,UnitType.VOLUME),new QuantityMeasurement(3.78,Unit.LITRE,UnitType.VOLUME));
        Assert.assertTrue(result);
    }

    @Test
    public void given1Litre_WhenComparedBy1000MilliLitre_ShouldReturnTrue() {
        quantityMeasurement.setMeasure(new Volume());
        boolean result = quantityMeasurement.compare(new QuantityMeasurement(1,Unit.LITRE,UnitType.VOLUME),new QuantityMeasurement(1000,Unit.MILLILITRE,UnitType.VOLUME));
        Assert.assertTrue(result);
    }

    @Test
    public void givenTwoVolumes_WhenAdded_ShouldReturnLitre() {
        quantityMeasurement.setMeasure(new Volume());
        double total=quantityMeasurement.getTotal(new QuantityMeasurement(1,Unit.GALLON,UnitType.VOLUME),new QuantityMeasurement(3.78,Unit.LITRE,UnitType.VOLUME));
        Assert.assertEquals(7.56, total,0.0);
    }

    @Test
    public void givenTwoVolumes_WhenAdded_ShouldReturn2Litre() {
        quantityMeasurement.setMeasure(new Volume());
        double total=quantityMeasurement.getTotal(new QuantityMeasurement(1,Unit.LITRE,UnitType.VOLUME),new QuantityMeasurement(1000,Unit.MILLILITRE,UnitType.VOLUME));
        Assert.assertEquals(2, total,0.0);
    }

    @Test
    public void given1Kilogram_WhenComparedBy1000Gram_ShouldReturnTrue() {
        quantityMeasurement.setMeasure(new Weight());
        boolean result = quantityMeasurement.compare(new QuantityMeasurement(1,Unit.KILOGRAM,UnitType.WEIGHT),new QuantityMeasurement(1000,Unit.GRAM,UnitType.WEIGHT));
        Assert.assertTrue(result);
    }

    @Test
    public void given1Tonne_WhenComparedBy1000Kilogram_ShouldReturnTrue() {
        quantityMeasurement.setMeasure(new Weight());
        boolean result = quantityMeasurement.compare(new QuantityMeasurement(1,Unit.TONNE,UnitType.WEIGHT),new QuantityMeasurement(1000,Unit.KILOGRAM,UnitType.WEIGHT));
        Assert.assertTrue(result);
    }

    @Test
    public void givenTwoWeights_WhenAdded_ShouldReturn_1001Kilogram() {
        quantityMeasurement.setMeasure(new Weight());
        double total = quantityMeasurement.getTotal(new QuantityMeasurement(1,Unit.TONNE,UnitType.WEIGHT),new QuantityMeasurement(1000,Unit.GRAM,UnitType.WEIGHT));
        Assert.assertEquals(1001, total,0.0);
    }
    @Test
    public void given212Fahrenheit_WhenComparedBy100Celsius_ShouldReturnTrue() {
        quantityMeasurement.setMeasure(new Temperature());
        boolean result = quantityMeasurement.compare(new QuantityMeasurement(90,Unit.FAHRENHEIT,UnitType.TEMPERATURE),new QuantityMeasurement(32.22,Unit.CELSIUS,UnitType.TEMPERATURE));
        Assert.assertTrue(result);
    }
}
