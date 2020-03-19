package com.bridgelabz;

@FunctionalInterface
public interface Measurement {
    QuantityMeasurement convert(QuantityMeasurement q,Unit unit);
}
