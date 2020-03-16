package com.bridgelabz;

public enum Unit {
    FEET_TO_INCH(1 / 12.0), INCH_TO_FEET(1 * 12.0);
    double units;

    Unit(double unit) {
        this.units = unit;
    }
}
