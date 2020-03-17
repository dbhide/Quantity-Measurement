package com.bridgelabz;

public enum Unit {
    FEET(1), INCH(1), YARD(1),CENTIMETER(1),GALLON(1), MILLILITRE(1), LITRE(1),KILOGRAM(1),GRAM(1), FAHRENHEIT(1), CELSIUS(1), TONNE(1),
    INCH_TO_FEET(1 / 12.0),
    FEET_TO_INCH(1 * 12.0),
    FFET_TO_YARD(1 / 3.0),
    YARD_TO_FEET(3.0),
    INCH_TO_YARD(1 / 36.0),
    YARD_TO_INCH(36.0),
    INCH_TO_CENTIMETER(2.54),
    CENTIMETER_TO_INCH(1 / 2.54),
    GALLON_TO_LITRE(3.78),
    LITRE_TO_MILLILITRE(1000.0),
    MILLILITRE_TO_LITRE(1 / 1000.0),
    KILOGRAM_TO_GRAM(1000.0),
    GRAM_TO_KILOGRAM(1 / 1000.0),
    TONNE_TO_KILOGRAM(1000.0),
    FAHRENHEIT_TO_CELSIUS(1 / 1.8);

    double units;

    Unit(double unit) {
        this.units = unit;
    }
}
