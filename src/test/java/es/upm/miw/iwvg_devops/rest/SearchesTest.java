package es.upm.miw.iwvg_devops.rest;

import es.upm.miw.iwvg_devops.practica.Fraction;
import es.upm.miw.iwvg_devops.practica.Searches;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SearchesTest {

    @Test
    void testfindDecimalFractionByUserName() {
        assertEquals(List.of(2.0, -0.2, 0.5, 1.3333333333333333), new Searches().findDecimalFractionByUserName("Ana")
                .collect(Collectors.toList()));
    }

    @Test
    void testfindUserFamilyNameByAllNegativeSignFractionDistinct() {
        assertEquals(List.of("Blanco", "López"), new Searches().findUserFamilyNameByAllNegativeSignFractionDistinct()
                .collect(Collectors.toList()));
    }

    @Test
    void testfindDecimalImproperFractionByUserName() {
        assertEquals(List.of(2.0, 1.3333333333333333), new Searches().findDecimalImproperFractionByUserName("Ana")
                .collect(Collectors.toList()));
    }

    @Test
    void testfindFractionDivisionByUserId() {
        assertEquals(60, new Searches().findFractionDivisionByUserId("2").getNumerator());
        assertEquals(-16, new Searches().findFractionDivisionByUserId("2").getDenominator());
    }

}
