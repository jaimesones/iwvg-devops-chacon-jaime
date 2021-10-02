package es.upm.miw.iwvg_devops.practica;

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

    public boolean isProper() {
        return (numerator < denominator);
    }

    public boolean isImproper() {
        return (numerator > denominator);
    }

    public boolean isEquivalent(Fraction fraction) {

        return (this.numerator * fraction.denominator == this.denominator * fraction.numerator);
    }

    public void sum(Fraction sumator) {

        int mnc = this.denominator  * sumator.getDenominator();

        this.numerator = mnc/this.denominator * this.numerator + mnc/sumator.getDenominator() * sumator.getNumerator();

        this.denominator = mnc;

    }

    public void multiply(Fraction mult) {

        this.numerator = this.numerator * mult.getNumerator();

        this.denominator = this.denominator * mult.getDenominator();

    }

    public void divide(Fraction divisor) {

        this.numerator = this.numerator * divisor.getDenominator();

        this.denominator = this.denominator * divisor.getNumerator();

    }

}
