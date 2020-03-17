package com.bridgelabz;

import java.util.Objects;

public class QuantityMeasurement {

    public double value;
    public Unit unitType;
    private Operations operation;

    public QuantityMeasurement() {};

    public QuantityMeasurement(double value, Unit unitType) {
        this.value = value;
        this.unitType = unitType;
    }

    public void setOperation(Operations operation) {
        this.operation=operation;
    }

    public QuantityMeasurement convertValue(QuantityMeasurement q,Unit unitType) {
        return this.operation.convert(q,unitType);
    }

    public double addition(QuantityMeasurement q1, QuantityMeasurement q2) {
        return this.operation.addition(q1,q2);
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
        return false;
    }
}
