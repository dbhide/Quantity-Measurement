package com.bridgelabz;

public class Operations {
    public double addition(QuantityMeasurement q1, QuantityMeasurement q2) {
        double q=q1.value+q2.value;
        return Math.round(q);
//        return Double.parseDouble(String.format("%.2f", q));
    }
}
