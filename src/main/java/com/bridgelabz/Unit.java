package com.bridgelabz;
public enum Unit {
    FEET(12), INCH(1), YARD(36.0),CENTIMETER(1 / 2.54),
    GALLON(3.78), MILLILITRE(1/1000.0), LITRE(1),
    TONNE(1000.0),KILOGRAM(1),GRAM(1 / 1000.0),
    FAHRENHEIT(1/1.8), CELSIUS(1)
    ;
    double units;

    Unit(double unit) {
        this.units = unit;
    }
}
