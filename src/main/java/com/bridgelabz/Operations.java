package com.bridgelabz;

public class Operations {
    public double addition(QuantityMeasurement q1, QuantityMeasurement q2) {
        double q=q1.value+q2.value;
        return Double.parseDouble(String.format("%.2f", q));
    }

    public QuantityMeasurement convert(QuantityMeasurement q, UnitConversion unitType) {
        q.value = q.value * unitType.units;
        return q;
    }
}
