package com.project.designpatterns;

public class methods {
        //Allows me to map a value from 1 range to another
    public static double mapRange(double sourceNumber, double fromA, double fromB, double toA, double toB, int decimalPrecision ) {
        double deltaA = fromB - fromA;
        double deltaB = toB - toA;
        double scale  = deltaB / deltaA;
        double negA   = -1 * fromA;
        double offset = (negA * scale) + toA;
        double finalNumber = (sourceNumber * scale) + offset;
        int calcScale = (int) Math.pow(10, decimalPrecision);
        return (double) Math.round(finalNumber * calcScale) / calcScale;
    }

}
