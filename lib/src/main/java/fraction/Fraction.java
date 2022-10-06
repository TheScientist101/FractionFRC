package fraction;

import java.lang.Math;

public class Fraction {
    // instance variables
    private int numerator;
    private int denominator;

    // constructors

    // Regular Fraction
    public Fraction(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    // Whole numbers
    public Fraction(int numerator) {
        this(numerator, 1);
    }

    // Empty Fraction
    public Fraction() {
        this(0, 1);
    }

    // methods
    public int getNumerator() {
        return numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    // Simplify the fraction
    public void reduce() {
        int greatestCommonFactor = 1;
        // Find the greatest common factor
        for (int i = 1; i <= Math.min(numerator, denominator); i++) {
            if (numerator % i == 0 && denominator % i == 0) {
                greatestCommonFactor = i;
            }
        }
        // Divide the numerator and denominator by the greatest common factor
        this.denominator /= greatestCommonFactor;
        this.numerator /= greatestCommonFactor;
    }

    public Fraction add(Fraction other) {
        int newNumerator = this.numerator * other.denominator + this.denominator * other.numerator;
        int newDenominator = this.denominator * other.denominator;
        Fraction newFraction = new Fraction(newNumerator, newDenominator);
        newFraction.reduce();
        return newFraction;
    }

    public Fraction subtract(Fraction other) {
        int newNumerator = this.numerator * other.denominator - this.denominator * other.numerator;
        int newDenominator = this.denominator * other.denominator;
        Fraction newFraction = new Fraction(newNumerator, newDenominator);
        newFraction.reduce();
        return newFraction;
    }

    public Fraction multiply(Fraction other) {
        int newNumerator = this.numerator * other.numerator;
        int newDenominator = this.denominator * other.denominator;
        Fraction newFraction = new Fraction(newNumerator, newDenominator);
        newFraction.reduce();
        return newFraction;
    }

    public Fraction divide(Fraction other) {
        int newNumerator = this.numerator * other.denominator;
        int newDenominator = this.denominator * other.numerator;
        Fraction newFraction = new Fraction(newNumerator, newDenominator);
        newFraction.reduce();
        return newFraction;
    }

    public boolean equals(Object other) {
        if (other instanceof Fraction) {
            Fraction otherFraction = (Fraction) other;
            return this.numerator * otherFraction.denominator == this.denominator * otherFraction.numerator;
        } else {
            return false;
        }
    }

    public int compareTo(Fraction other) {
        int thisNumerator = this.numerator * other.denominator;
        int otherNumerator = other.numerator * this.denominator;
        return thisNumerator > otherNumerator ? 1 : thisNumerator == otherNumerator ? 0 : -1;
    }

    public String toString() {
        return numerator + "/" + denominator;
    }
}