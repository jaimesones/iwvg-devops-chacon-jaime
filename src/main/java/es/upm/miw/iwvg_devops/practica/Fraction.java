package es.upm.miw.iwvg_devops.practica;

import java.util.List;

public class Fraction {
    
    private int numerator;

    private int denominator;

    public Fraction(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public Fraction() {
        this(1, 1);
    }

    public int getNumerator() {
        return numerator;
    }

    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    public void setDenominator(int denominator) {
        this.denominator = denominator;
    }

    public double decimal() {
        return (double) numerator / denominator;
    }

    @Override
    public String toString() {
        return "Fraction{" +
                "numerator=" + numerator +
                ", denominator=" + denominator +
                '}';
    }

    public boolean isProper() {return (numerator < denominator);
    }

    public boolean isImproper() {return (numerator > denominator);
    }

    public boolean isEquivalent(List<int[]> fractions) {
        int num1 = fractions.get(0)[0];
        int num2 = fractions.get(0)[1];
        int num3 = fractions.get(1)[0];
        int num4 = fractions.get(1)[1];
        return (num1*num4 == num2*num3);
    }

    public int[] add(List<int[]> fractions) {

        int result[] = {fractions.get(0)[0] + fractions.get(1)[0],fractions.get(0)[1] + fractions.get(1)[1]};

        return (result);
    }

    public int[] product(List<int[]> fractions) {

        int result[] = {fractions.get(0)[0] * fractions.get(1)[0],fractions.get(0)[1] * fractions.get(1)[1]};

        return (result);
    }

    public int[] divide(List<int[]> fractions) {

        int result[] = {fractions.get(0)[0] * fractions.get(1)[1],fractions.get(0)[1] * fractions.get(1)[0]};

        return (result);
    }

}
