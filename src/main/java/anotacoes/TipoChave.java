package main.java.anotacoes;

import java.lang.annotation.*;

/**
 * @author matheus.ferreira
 */
@Documented
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
public @interface TipoChave {

    String value();
}
