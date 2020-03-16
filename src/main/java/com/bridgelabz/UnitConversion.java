package com.bridgelabz;

public enum UnitConversion {
    INCH_TO_FEET(1 / 12.0),
    FEET_TO_INCH(1 * 12.0),
    FFET_TO_YARD(1 / 3.0),
    YARD_TO_FEET(3.0),
    INCH_TO_YARD(1 / 36.0),
    YARD_TO_INCH(36.0),
    INCH_TO_CENTIMETER(2.54),
    CENTIMETER_TO_INCH(1 / 2.54),
    GALLON_TO_LITRE(3.78),
    LITRE_TO_MILLILITRE(1000);
    double units;

    UnitConversion(double unit) {
        this.units = unit;
    }
}
