package com.bridgelabz;

import java.util.Objects;

public class QuantityMeasurement {

    public double value;
    public Unit unitType;
    private Operations operation;

    public enum Unit{FEET, INCH, YARD,CENTIMETER,GALLON, MILLILITRE, LITRE,KILOGRAM,GRAM, FAHRENHEIT, CELSIUS, TONNE};

    public QuantityMeasurement() { }

    public void setOperation(Operations operation) {
        this.operation=operation;
    }

    public QuantityMeasurement(double value, Unit unitType) {
        this.value = value;
        this.unitType = unitType;
    }

    public QuantityMeasurement convertValue(QuantityMeasurement q, UnitConversion unitType) {
        return this.operation.convert(q,unitType);
    }

    @Override
    public boolean equals(Object o) {
        if(o == this)
            return true;
        if(o == null || this.getClass() != o.getClass())
            return true;
        QuantityMeasurement that = (QuantityMeasurement) o;
        if(Objects.equals(value, that.value))
            return true;
        if(o != this)
            return false;
        return false;
    }
}
