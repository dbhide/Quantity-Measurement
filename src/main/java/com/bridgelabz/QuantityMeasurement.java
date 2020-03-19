package com.bridgelabz;

import java.util.Objects;

public class QuantityMeasurement {

    public double value;
    public Unit unitType;
    private Measurement operation;
    public QuantityMeasurement() { }

    public void setOperation(Measurement operation) {
        this.operation = operation;
    }
    public QuantityMeasurement(double value, Unit unitType) {
        this.value = value;
        this.unitType = unitType;
    }

    public boolean compare(QuantityMeasurement q1, QuantityMeasurement q2){
        if(q1.unitType.equals(q2.unitType))
            return Double.compare(q1.value,q2.value) == 0;
        return Double.compare(operation.convert(q1,q1.unitType).value,operation.convert(q2,q2.unitType).value) == 0;
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

    public double getTotal(QuantityMeasurement q1, QuantityMeasurement q2) {
        q1=operation.convert(q1,q1.unitType);
        q2=operation.convert(q2,q2.unitType);
        double total=operation.addition(q1, q2);
        return total;
    }
}
