package com.bridgelabz;

import java.util.Objects;

public class QuantityMeasurement {

    public double value;
    public Unit unitType;

    public QuantityMeasurement() {

    }

    public enum Unit{FEET, INCH, YARD,CENTIMETER,GALLON, MILLILITRE, LITRE,KILOGRAM,GRAM,TONNE};

    public QuantityMeasurement(double value, Unit unitType) {
        this.value = value;
        this.unitType = unitType;
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

    public QuantityMeasurement convertValue(QuantityMeasurement q, UnitConversion unitType) {

        q.value = q.value * unitType.units;
        return q;
    }
}
