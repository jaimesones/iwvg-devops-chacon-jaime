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

}
