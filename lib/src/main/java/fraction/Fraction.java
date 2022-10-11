package fraction;

import java.lang.Math;

public class Fraction {
    // instance variables
    private int numerator;
    private int denominator;

    // constructors

    // Regular Fraction
    public Fraction(int numerator, int denominator) throws IllegalArgumentException {
        if (denominator == 0) {
            throw new IllegalArgumentException("Denominator cannot be 0");
        }
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

    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }

    public void setDenominator(int denominator) throws IllegalArgumentException {
        if (denominator == 0) {
            throw new IllegalArgumentException("Denominator cannot be 0");
        }
        this.denominator = denominator;
    }

    // Simplify the fraction
    public static Fraction reduce(Fraction fraction) {
        int numerator = fraction.getNumerator();
        int denominator = fraction.getDenominator();
        if (numerator == 0) {
            return new Fraction(0, 1);
        }
        int greatestCommonFactor = 1;
        int numeratorAbs = Math.abs(numerator);
        int denominatorAbs = Math.abs(denominator);
        int smaller = Math.min(numeratorAbs, denominatorAbs);
        // Find the greatest common factor
        for (int i = 1; i <= smaller; i++) {
            if (numeratorAbs % i == 0 && denominatorAbs % i == 0) {
                greatestCommonFactor = i;
            }
        }
        if (denominator < 0) {
            greatestCommonFactor *= -1;
        }
        // Divide the numerator and denominator by the greatest common factor
        denominator /= greatestCommonFactor;
        numerator /= greatestCommonFactor;
        return new Fraction(numerator, denominator);
    }

    // Add two fractions
    public static Fraction add(Fraction first,Fraction other) {
        int newNumerator = first.numerator * other.denominator + first.denominator * other.numerator;
        int newDenominator = first.denominator * other.denominator;
        Fraction newFraction = Fraction.reduce(new Fraction(newNumerator, newDenominator));
        return newFraction;
    }

    // Subtract two fractions
    public static Fraction subtract(Fraction first, Fraction other) {
        int newNumerator = first.numerator * other.denominator - first.denominator * other.numerator;
        int newDenominator = first.denominator * other.denominator;
        Fraction newFraction = Fraction.reduce(new Fraction(newNumerator, newDenominator));
        return newFraction;
    }

    // Multiply two fractions
    public static Fraction multiply(Fraction first, Fraction other) {
        int newNumerator = first.numerator * other.numerator;
        int newDenominator = first.denominator * other.denominator;
        Fraction newFraction = Fraction.reduce(new Fraction(newNumerator, newDenominator));
        return newFraction;
    }

    // Divide two fractions
    public static Fraction divide(Fraction first, Fraction other) {
        int newNumerator = first.numerator * other.denominator;
        int newDenominator = first.denominator * other.numerator;
        Fraction newFraction = Fraction.reduce(new Fraction(newNumerator, newDenominator));
        return newFraction;
    }

    // Addition assignment for a fraction
    public void add(Fraction other) {
        Fraction newFraction = Fraction.add(this, other);
        this.numerator = newFraction.numerator;
        this.denominator = newFraction.denominator;
    }

    // Subtraction assignment for a fraction
    public void subtract(Fraction other) {
        Fraction newFraction = Fraction.subtract(this, other);
        this.numerator = newFraction.numerator;
        this.denominator = newFraction.denominator;
    }

    // Multiplication assignment for a fraction
    public void multiply(Fraction other) {
        Fraction newFraction = Fraction.multiply(this, other);
        this.numerator = newFraction.numerator;
        this.denominator = newFraction.denominator;
    }

    // Division assignment for a fraction
    public void divide(Fraction other) {
        Fraction newFraction = Fraction.divide(this, other);
        this.numerator = newFraction.numerator;
        this.denominator = newFraction.denominator;
    }

    // Check if two fractions are equal
    public boolean equals(Object other) {
        if (other instanceof Fraction) {
            Fraction otherFraction = (Fraction) other;
            return this.numerator * otherFraction.denominator == this.denominator * otherFraction.numerator;
        } else {
            return false;
        }
    }

    // Compare two fractions
    public int compareTo(Fraction other) {
        int thisNumerator = this.numerator * other.denominator;
        int otherNumerator = other.numerator * this.denominator;
        return thisNumerator > otherNumerator ? 1 : thisNumerator == otherNumerator ? 0 : -1;
    }

    // Convert the fraction to a string
    public String toString() {
        return numerator + "/" + denominator;
    }
}