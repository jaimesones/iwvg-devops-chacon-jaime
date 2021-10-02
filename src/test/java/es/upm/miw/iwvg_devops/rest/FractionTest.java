package es.upm.miw.iwvg_devops.rest;

import es.upm.miw.iwvg_devops.practica.Fraction;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.assertEquals;

public class FractionTest {

    private Fraction fraction;

    @BeforeEach
    void before() {
        fraction = new Fraction(2, 3);
    }

    @Test
    void testinstance() {
        fraction = new Fraction();
    }

    @Test
    void testgetNumerator() {
        assertEquals(2, fraction.getNumerator());
    }

    @Test
    void testgetDenominator() {
        assertEquals(3, fraction.getDenominator());
    }

    @Test
    void decimal() {
        assertEquals(0.6666666666666666, fraction.decimal());
    }

    @Test
    void testtoString() {
        assertEquals("Fraction{numerator=2, denominator=3}", fraction.toString());
    }

    @Test
    void testsetNumerator() {
        fraction.setNumerator(4);
        assertEquals(4, fraction.getNumerator());
    }

    @Test
    void testsetDenominator() {
        fraction.setDenominator(4);
        assertEquals(4, fraction.getDenominator());
    }

    @Test
    void testisProper() {
        assertEquals(true, fraction.isProper());
    }

    @Test
    void testisImproper() {
        assertEquals(false, fraction.isImproper());
    }

    @Test
    void testisEquivalent() {
        Fraction fraction = new Fraction(2,3);
        assertEquals(false, fraction.isEquivalent(new Fraction(1,2)));
    }

    @Test
    void testsum() {
        Fraction fraction = new Fraction(2,3);
        fraction.sum(new Fraction(1,3));
        assertEquals(9, fraction.getNumerator());
        assertEquals(9, fraction.getDenominator());
    }

    @Test
    void testsmultiply() {
        Fraction fraction = new Fraction(2,3);
        fraction.multiply(new Fraction(1,2));
        assertEquals(2, fraction.getNumerator());
        assertEquals(6, fraction.getDenominator());
    }

    @Test
    void testsdivide() {
        Fraction fraction = new Fraction(2,3);
        fraction.divide(new Fraction(1,2));
        assertEquals(4, fraction.getNumerator());
        assertEquals(3, fraction.getDenominator());
    }

}
