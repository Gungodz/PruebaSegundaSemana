package prueba.hibernate.jpa.interfaces;

/**
 * Interface Conducible.
 */
public interface Conducible { // Conducible
    boolean arrancar();

    boolean avanzar(int distancia);

    boolean retroceder(int distancia);

    boolean parar();

}
