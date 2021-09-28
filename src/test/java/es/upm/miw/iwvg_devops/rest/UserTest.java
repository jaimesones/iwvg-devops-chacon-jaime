package es.upm.miw.iwvg_devops.rest;

import es.upm.miw.iwvg_devops.practica.Fraction;
import es.upm.miw.iwvg_devops.practica.User;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UserTest {

    private User user;
    private List<Fraction> fractions;

    @BeforeEach
    void before() {
        List<Fraction> fractions = List.of(
                new Fraction(0, 1),
                new Fraction(1, 1),
                new Fraction(2, 1)
        );
        user = new User("1", "Oscar", "Fernandez", fractions);
    }

    @Test
    void testgetId() {
        assertEquals("1", user.getId());
    }

    @Test
    void testgetName() {
        assertEquals("Oscar", user.getName());
    }

    @Test
    void testsetName() {
        user.setName("Pedro");
        assertEquals("Pedro", user.getName());
    }

    @Test
    void testsetFamilyName() {
        user.setFamilyName("Lopez");
        assertEquals("Lopez", user.getFamilyName());
    }

    @Test
    void testgetFractions() {
        fractions = user.getFractions();
        assertEquals(fractions, user.getFractions());
    }

    @Test
    void testsetFractions() {
        List<Fraction> fractions = List.of(
                new Fraction(10, 20),
                new Fraction(20, 30),
                new Fraction(30, 30)
        );
        user.setFractions(fractions);
        assertEquals(fractions, user.getFractions());
    }

    @Test
    void fullName() {
        assertEquals("Oscar Fernandez", user.fullName());
    }

    @Test
    void initials() {
        assertEquals("O.", user.initials());
    }

    @Test
    void testtoString() {
        assertEquals("User{id='1', name='Oscar', familyName='Fernandez', fractions=[Fraction{numerator=0, denominator=1}, Fraction{numerator=1, denominator=1}, Fraction{numerator=2, denominator=1}]}", user.toString());
    }


}

