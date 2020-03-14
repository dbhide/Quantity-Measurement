package com.bridgelabz;

public enum Unit {
    FEET(1 / 12.0), INCH(1 * 12.0);
    double units;

    Unit(double unit) {
        this.units = unit;
    }
}
