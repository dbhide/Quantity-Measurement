package com.bridgelabz;

public class Temperature implements Measurement {

    @Override
    public QuantityMeasurement convert(QuantityMeasurement q, Unit unit) {
        if(q.unit.equals(unit.FAHRENHEIT))
            q.value=Double.parseDouble(String.format("%.2f",(q.value-32)*unit.units));
        return q;
    }
}
