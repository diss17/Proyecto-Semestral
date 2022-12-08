package Fisicas;

import Objetos.Automovil;
import java.awt.Rectangle;

/**
 * Esta clase se encarga de verificar las colisiones del auto con la pista
 *
 * @author Daniel Soto
 * @version final
 */
public class BoxCollider {
    /**
     * Construtor de clase vacio
     */
    public BoxCollider() {
    }

    Rectangle rectangulo = new Rectangle();

    /**
     * Metodo que verifica las colisiones del auto con la el rectangulo de la
     * pista exterior, es decir con el borde exterior de ella.
     *
     * @param a parametro del tipo Automovil que con sus metodos se encarga de
     * comparar la posicion del auto con respecto a la pista
     * @param aux parametro del tipo Rectangle, el cual mediante sus propios
     * metodos se crea la delimitacion por la cual puede avanzar el auto
     * @return return del tipo booleano, el cual va comparando y verificando si
     * existe colision o no
     */
    public boolean CheckColliderInt(Automovil a, Rectangle aux) {
        rectangulo = aux;
        return a.getX() < rectangulo.getMaxX() && a.getX() > rectangulo.getMinX() && a.getY() > rectangulo.getMinY() && a.getY() < rectangulo.getMaxY();
    }

    /**
     * Metodo que verifica las colisiones del auto con la el rectangulo de la
     * pista interior, es decir con el borde interior de ella.
     *
     * @param a parametro del tipo Automovil que con sus metodos se encarga de
     * comparar la posicion del auto con respecto a la pista
     * @param aux parametro del tipo Rectangle, el cual mediante sus propios
     * metodos se crea la delimitacion por la cual puede avanzar el auto
     * @return return del tipo booleano, el cual va comparando y verificando si
     * existe colision o no
     */
    public boolean CheckColliderExt(Automovil a, Rectangle aux) {
        rectangulo = aux;
        return a.getX() > rectangulo.getMaxX() || a.getX() < rectangulo.getMinX() || a.getY() < rectangulo.getMinY() || a.getY() > rectangulo.getMaxY();
    }

    /**
     * Metodo utilizado para verificar el paso del auto, por el rectangulo
     * llamado "meta"
     *
     * @param a parametro del tipo Automovil que con sus metodos se encarga de
     * comparar la posicion del auto con respecto a la meta
     * @param aux parametro del tipo Rectangle, el cual mediante sus propios
     * metodos se crea la delimitacion por la cual puede avanzar el auto
     * @return return del tipo booleano, el cual va comparando y verificando si
     * existe colision o no
     */
    public boolean CheckColliderMeta(Automovil a, Rectangle aux) {
        rectangulo = aux;
        return a.getX() < rectangulo.getMaxX() && a.getX() > rectangulo.getMinX() && a.getY() > rectangulo.getMinY() && a.getY() < rectangulo.getMaxY();
    }

}
