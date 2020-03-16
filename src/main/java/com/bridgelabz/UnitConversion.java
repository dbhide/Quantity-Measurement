package com.bridgelabz;

public enum UnitConversion {
    INCH_TO_FEET(1 / 12.0), FEET_TO_INCH(1 * 12.0);
    double units;

    UnitConversion(double unit) {
        this.units = unit;
    }
}
