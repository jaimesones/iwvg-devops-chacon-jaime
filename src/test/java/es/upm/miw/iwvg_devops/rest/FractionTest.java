package es.upm.miw.iwvg_devops.rest;

import es.upm.miw.iwvg_devops.practica.Fraction;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

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
        List<int[]> fractions = new ArrayList<int[]>();
        int[] anExample1 = {2, 1};
        int[] anExample2 = {6, 3};
        fractions.add(anExample1);
        fractions.add(anExample2);
        assertEquals(true, fraction.isEquivalent(fractions));
    }

    @Test
    void testsadd() {
        List<int[]> fractions = new ArrayList<int[]>();
        int[] anExample1 = {2, 1};
        int[] anExample2 = {5, 3};
        fractions.add(anExample1);
        fractions.add(anExample2);
        int[] testresult = fraction.add(fractions);
        assertEquals(7, testresult[0]);
        assertEquals(4, testresult[1]);
    }

    @Test
    void testsproduct() {
        List<int[]> fractions = new ArrayList<int[]>();
        int[] anExample1 = {2, 1};
        int[] anExample2 = {5, 3};
        fractions.add(anExample1);
        fractions.add(anExample2);
        int[] testresult = fraction.product(fractions);
        assertEquals(10, testresult[0]);
        assertEquals(3, testresult[1]);
    }

    @Test
    void testsdivide() {
        List<int[]> fractions = new ArrayList<int[]>();
        int[] anExample1 = {2, 1};
        int[] anExample2 = {5, 3};
        fractions.add(anExample1);
        fractions.add(anExample2);
        int[] testresult = fraction.divide(fractions);
        assertEquals(6, testresult[0]);
        assertEquals(5, testresult[1]);
    }

}
