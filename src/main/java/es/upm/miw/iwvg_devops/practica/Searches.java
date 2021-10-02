package es.upm.miw.iwvg_devops.practica;

import java.util.stream.Stream;

public class Searches {

    public Stream<Double> findDecimalFractionByUserName(String userName) {
        return new UsersDatabase().findAll()
                .filter(user -> userName.equals(user.getName()))
                .flatMap(user -> user.getFractions().stream()
                        .filter(i -> null != i)
                )
                .map(Fraction::decimal);
    }

}
