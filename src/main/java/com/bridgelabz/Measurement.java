package com.bridgelabz;

public interface Measurement {
    QuantityMeasurement convert(QuantityMeasurement q,Unit unit);

    default double addition(QuantityMeasurement q1,QuantityMeasurement q2){
        return Double.parseDouble(String.format("%.2f",q1.value+q2.value));
    }
}
