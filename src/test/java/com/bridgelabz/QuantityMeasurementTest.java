package com.bridgelabz;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;

public class QuantityMeasurementTest {
    QuantityMeasurement quantityMeasurement;
    Operations operation;

    @Before
    public void setUp() throws IOException {
        quantityMeasurement=new QuantityMeasurement();
        operation =new Operations();
        quantityMeasurement.setOperation(operation);
    }

    @Test
    public void given0Feet_WhenComparedWithAnother0Feet_ShouldReturnTrue() {
        quantityMeasurement = new QuantityMeasurement(0, QuantityMeasurement.Unit.FEET);
        boolean result = quantityMeasurement.equals(new QuantityMeasurement(0 , QuantityMeasurement.Unit.FEET));
        Assert.assertTrue(result);
    }

    @Test
    public void givenFeet_WhenComparedWithNullValue_ShouldReturnTrue() {
        quantityMeasurement = new QuantityMeasurement(0, QuantityMeasurement.Unit.FEET);
        boolean result = quantityMeasurement.equals(null);
        Assert.assertTrue(result);
    }

    @Test
    public void givenFeetValue_WhenComparedByReference_ShouldReturnFalse() {
        quantityMeasurement = new QuantityMeasurement(0, QuantityMeasurement.Unit.FEET);
        boolean result = quantityMeasurement.equals(new QuantityMeasurement(10, QuantityMeasurement.Unit.FEET));
        Assert.assertFalse(result);
    }

    @Test
    public void givenFeetValue_WhenComparedByType_ShouldReturnTrue() {
        quantityMeasurement = new QuantityMeasurement(0, QuantityMeasurement.Unit.FEET);
        boolean result = quantityMeasurement.equals(quantityMeasurement);
        Assert.assertTrue(result);
    }

    @Test
    public void givenFeet_WhenComparedByValue_ShouldReturnTrue() {
        quantityMeasurement = new QuantityMeasurement(0, QuantityMeasurement.Unit.FEET);
        boolean result = quantityMeasurement.equals(new QuantityMeasurement(0, QuantityMeasurement.Unit.FEET));
        Assert.assertTrue(result);
    }

    @Test
    public void givenFeet_WhenComparedByNegativeValue_ShouldReturnFalse() {
        quantityMeasurement = new QuantityMeasurement(-2.0, QuantityMeasurement.Unit.FEET);
        boolean result = quantityMeasurement.equals(new QuantityMeasurement(0, QuantityMeasurement.Unit.FEET));
        Assert.assertFalse(result);
    }

    @Test
    public void given0Inch_WhenComparedWithAnother0Inch_ShouldReturnTrue() {
        quantityMeasurement = new QuantityMeasurement(0, QuantityMeasurement.Unit.INCH);
        boolean result = quantityMeasurement.equals(new QuantityMeasurement(0 , QuantityMeasurement.Unit.INCH));
        Assert.assertTrue(result);
    }

    @Test
    public void givenInch_WhenComparedWithNullValue_ShouldReturnTrue() {
        quantityMeasurement = new QuantityMeasurement(0, QuantityMeasurement.Unit.INCH);
        boolean result = quantityMeasurement.equals(null);
        Assert.assertTrue(result);
    }

    @Test
    public void givenInchValue_WhenComparedByReference_ShouldReturnFalse() {
        quantityMeasurement = new QuantityMeasurement(0, QuantityMeasurement.Unit.INCH);
        boolean result = quantityMeasurement.equals(new QuantityMeasurement(10, QuantityMeasurement.Unit.INCH));
        Assert.assertFalse(result);
    }

    @Test
    public void givenInchValue_WhenComparedByType_ShouldReturnTrue() {
        quantityMeasurement = new QuantityMeasurement(0, QuantityMeasurement.Unit.INCH);
        boolean result = quantityMeasurement.equals(quantityMeasurement);
        Assert.assertTrue(result);
    }

    @Test
    public void givenInch_WhenComparedByValue_ShouldReturnTrue() {
        quantityMeasurement = new QuantityMeasurement(0, QuantityMeasurement.Unit.INCH);
        boolean result = quantityMeasurement.equals(new QuantityMeasurement(0, QuantityMeasurement.Unit.INCH));
        Assert.assertTrue(result);
    }

    @Test
    public void givenInch_WhenComparedByNegativeValue_ShouldReturnFalse() {
        quantityMeasurement = new QuantityMeasurement(-5, QuantityMeasurement.Unit.INCH);
        boolean result = quantityMeasurement.equals(new QuantityMeasurement(0, QuantityMeasurement.Unit.INCH));
        Assert.assertFalse(result);
    }

    @Test
    public void given0Feet_WhenComparedBy0Inch_ShouldReturnTrue() {
        quantityMeasurement = new QuantityMeasurement(0, QuantityMeasurement.Unit.INCH);
        boolean result = quantityMeasurement.equals(new QuantityMeasurement(0, QuantityMeasurement.Unit.FEET));
        Assert.assertTrue(result);
    }

    @Test
    public void given1Feet_WhenComparedBy1Inch_ShouldReturnFalse() {
        QuantityMeasurement q1 = new QuantityMeasurement(1, QuantityMeasurement.Unit.FEET);
        q1=quantityMeasurement.convertValue(q1, UnitConversion.FEET_TO_INCH);
        boolean result = q1.equals(new QuantityMeasurement(1, QuantityMeasurement.Unit.INCH));
        Assert.assertFalse(result);
    }

    @Test
    public void given1Inch_WhenComparedBy1Feet_ShouldReturnFalse() {
        QuantityMeasurement q1 = new QuantityMeasurement(1, QuantityMeasurement.Unit.INCH);
        q1=quantityMeasurement.convertValue(q1, UnitConversion.INCH_TO_FEET);
        boolean result = q1.equals(new QuantityMeasurement(1, QuantityMeasurement.Unit.FEET));
        Assert.assertFalse(result);
    }

    @Test
    public void given1Feet_WhenComparedBy12Inch_ShouldReturnTrue() {
        QuantityMeasurement q1 = new QuantityMeasurement(1, QuantityMeasurement.Unit.FEET);
        q1=quantityMeasurement.convertValue(q1, UnitConversion.FEET_TO_INCH);
        boolean result = q1.equals(new QuantityMeasurement(12, QuantityMeasurement.Unit.INCH));
        Assert.assertTrue(result);
    }

    @Test
    public void given12Inch_WhenComparedBy1Feet_ShouldReturnTrue() {
        QuantityMeasurement q1 = new QuantityMeasurement(12, QuantityMeasurement.Unit.INCH);
        q1=quantityMeasurement.convertValue(q1, UnitConversion.INCH_TO_FEET);
        boolean result = q1.equals(new QuantityMeasurement(1, QuantityMeasurement.Unit.FEET));
        Assert.assertTrue(result);
    }

    @Test
    public void given3Feet_WhenComparedBy1Yard_ShouldReturnTrue() {
        QuantityMeasurement q1 = new QuantityMeasurement(3, QuantityMeasurement.Unit.FEET);
        q1=quantityMeasurement.convertValue(q1, UnitConversion.FFET_TO_YARD);
        boolean result = q1.equals(new QuantityMeasurement(1, QuantityMeasurement.Unit.YARD));
        Assert.assertTrue(result);
    }

    @Test
    public void given1Feet_WhenComparedBy1Yard_ShouldReturnFalse() {
        QuantityMeasurement q1 = new QuantityMeasurement(1, QuantityMeasurement.Unit.FEET);
        q1=quantityMeasurement.convertValue(q1, UnitConversion.FFET_TO_YARD);
        boolean result = q1.equals(new QuantityMeasurement(1, QuantityMeasurement.Unit.YARD));
        Assert.assertFalse(result);
    }

    @Test
    public void given1Inch_WhenComparedBy1Yard_ShouldReturnFalse() {
        QuantityMeasurement q1 = new QuantityMeasurement(1, QuantityMeasurement.Unit.INCH);
        q1=quantityMeasurement.convertValue(q1, UnitConversion.INCH_TO_YARD);
        boolean result = q1.equals(new QuantityMeasurement(1, QuantityMeasurement.Unit.YARD));
        Assert.assertFalse(result);
    }

    @Test
    public void given1Yard_WhenComparedBy36Inch_ShouldReturnTrue() {
        QuantityMeasurement q1 = new QuantityMeasurement(1, QuantityMeasurement.Unit.YARD);
        q1=quantityMeasurement.convertValue(q1, UnitConversion.YARD_TO_INCH);
        boolean result = q1.equals(new QuantityMeasurement(36, QuantityMeasurement.Unit.INCH));
        Assert.assertTrue(result);
    }

    @Test
    public void given36Inch_WhenComparedBy1Yard_ShouldReturnTrue() {
        QuantityMeasurement q1 = new QuantityMeasurement(36, QuantityMeasurement.Unit.INCH);
        q1=quantityMeasurement.convertValue(q1, UnitConversion.INCH_TO_YARD);
        boolean result = q1.equals(new QuantityMeasurement(1, QuantityMeasurement.Unit.YARD));
        Assert.assertTrue(result);
    }

    @Test
    public void given1Yard_WhenComparedBy3Feet_ShouldReturnTrue() {
        QuantityMeasurement q1 = new QuantityMeasurement(1, QuantityMeasurement.Unit.YARD);
        q1=quantityMeasurement.convertValue(q1, UnitConversion.YARD_TO_FEET);
        boolean result = q1.equals(new QuantityMeasurement(3, QuantityMeasurement.Unit.FEET));
        Assert.assertTrue(result);
    }

    @Test
    public void given2Inch_WhenComparedBy5Centimeter_ShouldReturnTrue() {
        QuantityMeasurement q1 = new QuantityMeasurement(2, QuantityMeasurement.Unit.INCH);
        q1=quantityMeasurement.convertValue(q1, UnitConversion.INCH_TO_CENTIMETER);
        boolean result = q1.equals(new QuantityMeasurement(5.08, QuantityMeasurement.Unit.CENTIMETER));
        Assert.assertTrue(result);
    }

    @Test
    public void givenTwoLengths_WhenAdded_ShouldReturn_4Inch() {
        QuantityMeasurement q1 = new QuantityMeasurement(2, QuantityMeasurement.Unit.INCH);
        QuantityMeasurement q2 = new QuantityMeasurement(2, QuantityMeasurement.Unit.INCH);
        Assert.assertEquals(4, operation.addition(q1,q2),0.0);
    }

    @Test
    public void givenTwoLengths_WhenAdded_ShouldReturn_14Inch() {
        QuantityMeasurement q1 = new QuantityMeasurement(1, QuantityMeasurement.Unit.FEET);
        q1=quantityMeasurement.convertValue(q1,UnitConversion.FEET_TO_INCH);
        QuantityMeasurement q2 = new QuantityMeasurement(2, QuantityMeasurement.Unit.INCH);
        Assert.assertEquals(14, operation.addition(q1,q2),0.0);
    }

    @Test
    public void givenTwoLengths_WhenAdded_ShouldReturn_24Inch() {
        QuantityMeasurement q1 = new QuantityMeasurement(1, QuantityMeasurement.Unit.FEET);
        q1=quantityMeasurement.convertValue(q1,UnitConversion.FEET_TO_INCH);
        QuantityMeasurement q2 = new QuantityMeasurement(1, QuantityMeasurement.Unit.FEET);
        q2=quantityMeasurement.convertValue(q2,UnitConversion.FEET_TO_INCH);
        Assert.assertEquals(24, operation.addition(q1,q2),0.0);
    }

    @Test
    public void givenTwoLengths_WhenAdded_ShouldReturn_3Inch() {
        QuantityMeasurement q1 = new QuantityMeasurement(2, QuantityMeasurement.Unit.INCH);
        QuantityMeasurement q2 = new QuantityMeasurement(2.5, QuantityMeasurement.Unit.CENTIMETER);
        q2=quantityMeasurement.convertValue(q2,UnitConversion.CENTIMETER_TO_INCH);
        Assert.assertEquals(2.98, operation.addition(q1,q2),0.0);
    }

    @Test
    public void given1Gallon_WhenComparedByLitre_ShouldReturnTrue() {
        QuantityMeasurement q1 = new QuantityMeasurement(1, QuantityMeasurement.Unit.GALLON);
        q1=quantityMeasurement.convertValue(q1,UnitConversion.GALLON_TO_LITRE);
        boolean result = q1.equals(new QuantityMeasurement(3.78, QuantityMeasurement.Unit.LITRE));
        Assert.assertTrue(result);
    }

    @Test
    public void given1Litre_WhenComparedBy1000MilliLitre_ShouldReturnTrue() {
        QuantityMeasurement q1 = new QuantityMeasurement(1, QuantityMeasurement.Unit.LITRE);
        q1=quantityMeasurement.convertValue(q1,UnitConversion.LITRE_TO_MILLILITRE);
        boolean result = q1.equals(new QuantityMeasurement(1000, QuantityMeasurement.Unit.MILLILITRE));
        Assert.assertTrue(result);
    }

    @Test
    public void givenTwoVolumes_WhenAdded_ShouldReturnLitre() {
        QuantityMeasurement q1 = new QuantityMeasurement(1, QuantityMeasurement.Unit.GALLON);
        q1=quantityMeasurement.convertValue(q1,UnitConversion.GALLON_TO_LITRE);
        QuantityMeasurement q2=new QuantityMeasurement(3.78, QuantityMeasurement.Unit.LITRE);
        Assert.assertEquals(7.56, operation.addition(q1,q2),0.0);
    }

    @Test
    public void givenTwoVolumes_WhenAdded_ShouldReturn2Litre() {
        QuantityMeasurement q1 = new QuantityMeasurement(1, QuantityMeasurement.Unit.LITRE);
        QuantityMeasurement q2=new QuantityMeasurement(1000, QuantityMeasurement.Unit.MILLILITRE);
        q2=quantityMeasurement.convertValue(q2,UnitConversion.MILLIILITRE_TO_LITRE);
        Assert.assertEquals(2, operation.addition(q1,q2),0.0);
    }

    @Test
    public void given1Kilogram_WhenComparedBy1000Gram_ShouldReturnTrue() {
        QuantityMeasurement q1 = new QuantityMeasurement(1, QuantityMeasurement.Unit.KILOGRAM);
        q1=quantityMeasurement.convertValue(q1,UnitConversion.KILOGRAM_TO_GRAM);
        boolean result = q1.equals(new QuantityMeasurement(1000, QuantityMeasurement.Unit.GRAM));
        Assert.assertTrue(result);
    }

    @Test
    public void given1Tonne_WhenComparedBy1000Kilogram_ShouldReturnTrue() {
        QuantityMeasurement q1 = new QuantityMeasurement(1, QuantityMeasurement.Unit.TONNE);
        q1=quantityMeasurement.convertValue(q1,UnitConversion.TONNE_TO_KILOGRAM);
        boolean result = q1.equals(new QuantityMeasurement(1000, QuantityMeasurement.Unit.KILOGRAM));
        Assert.assertTrue(result);
    }

    @Test
    public void givenTwoWeights_WhenAdded_ShouldReturn_1001Kilogram() {
        QuantityMeasurement q1 = new QuantityMeasurement(1, QuantityMeasurement.Unit.TONNE);
        q1=quantityMeasurement.convertValue(q1,UnitConversion.TONNE_TO_KILOGRAM);
        QuantityMeasurement q2=new QuantityMeasurement(1000, QuantityMeasurement.Unit.GRAM);
        q2=quantityMeasurement.convertValue(q2,UnitConversion.GRAM_TO_KILOGRAM);
        Assert.assertEquals(1001, operation.addition(q1,q2),0.0);
    }

    @Test
    public void given212Fahrenheit_WhenComparedBy100Celsius_ShouldReturnTrue() {
        QuantityMeasurement q1 = new QuantityMeasurement(212, QuantityMeasurement.Unit.FAHRENHEIT);
        q1=quantityMeasurement.convertValue(q1,UnitConversion.FAHRENHEIT_TO_CELSIUS);
        boolean result = q1.equals(new QuantityMeasurement(100, QuantityMeasurement.Unit.CELSIUS));
        Assert.assertTrue(result);
    }
}
