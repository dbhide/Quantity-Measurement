package com.bridgelabz;

import java.util.Objects;

public class QuantityMeasurement {

    public double value;
    public Unit unit;
    private Measurement measurement;
    private UnitType unitType;
    public QuantityMeasurement() { }

    public void setMeasure(Measurement measure) {
        this.measurement = measure;
    }
    public QuantityMeasurement(double value, Unit unit ,UnitType unitType) {
        this.value = value;
        this.unit = unit;
        this.unitType=unitType;
    }

    public double getTotal(QuantityMeasurement q1, QuantityMeasurement q2){
        if(!q1.unitType.equals(q2.unitType))
            return 0.0;
        return Double.parseDouble(String.format("%.2f",this.convert(q2).value+this.convert(q1).value));
    }

    public boolean compare(QuantityMeasurement q1, QuantityMeasurement q2){
        if(!q1.unitType.equals(q2.unitType))
            return false;
        return Double.compare(this.convert(q1).value, this.convert(q2).value) == 0;
    }

    private QuantityMeasurement convert(QuantityMeasurement q) {
        q=measurement.convert(q,q.unit);
        return q;
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
