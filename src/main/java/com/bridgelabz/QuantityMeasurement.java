package com.bridgelabz;

import java.util.Objects;

public class QuantityMeasurement {

    public double value;
    public Unit unitType;

    public QuantityMeasurement(double value, Unit unitType) {
        this.value = value;
        this.unitType = unitType;
    }

    public QuantityMeasurement() {
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
