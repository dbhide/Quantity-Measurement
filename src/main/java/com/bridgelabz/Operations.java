package com.bridgelabz;

public class Operations {

    public double addition(QuantityMeasurement q1, QuantityMeasurement q2) {
        return Double.parseDouble(String.format("%.2f", q1.value+q2.value));
    }

    public QuantityMeasurement convert(QuantityMeasurement q, Unit unitType) {
        if(q.unitType.equals(Unit.FAHRENHEIT))
            q.value = Double.parseDouble(String.format("%.2f",(q.value - 32) * unitType.units));
        else
            q.value = Double.parseDouble(String.format("%.2f",q.value * unitType.units));
        return q;
    }
}
