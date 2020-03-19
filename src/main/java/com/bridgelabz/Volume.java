package com.bridgelabz;

public class Volume implements Measurement {
    @Override
    public QuantityMeasurement convert(QuantityMeasurement q, Unit unit) {
        q.value = Double.parseDouble(String.format("%.2f",q.value * unit.units));
        return q;
    }
}
