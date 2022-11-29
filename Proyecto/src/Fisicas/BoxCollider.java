package Fisicas;

import Objetos.Automovil;
import java.awt.Rectangle;

public class BoxCollider {

    Rectangle rectangulo = new Rectangle();

    public boolean CheckColliderInt(Automovil a, Rectangle aux) {
        rectangulo = aux;
        return a.getX() < rectangulo.getMaxX() && a.getX() > rectangulo.getMinX() && a.getY() > rectangulo.getMinY() && a.getY() < rectangulo.getMaxY();
    }

    public boolean CheckColliderExt(Automovil a, Rectangle aux) {
        rectangulo = aux;
        return a.getX() > rectangulo.getMaxX() || a.getX() < rectangulo.getMinX() || a.getY() < rectangulo.getMinY() || a.getY() > rectangulo.getMaxY();
    }

    public boolean CheckColliderMeta(Automovil a, Rectangle aux) {
        rectangulo = aux;
        return a.getX() < rectangulo.getMaxX()  && a.getX() > rectangulo.getMinX() && a.getY() > rectangulo.getMinY() && a.getY() < rectangulo.getMaxY();
    }

}
