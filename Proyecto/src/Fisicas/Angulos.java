package Fisicas;

import java.awt.Point;
/**
 * Clase encargada de controlar las fisicas de nuestro auto
 * @author Gaspar Jimenez
 * @author Daniel Soto
 * @author Franchesca Mora
 */
public class Angulos {

    /**
     * Obtiene un nuevo punto a una cierta distancia y angulo desde la
     * horizontal
     *
     * @param uno punto actual
     * @param r radio en pixeles
     * @param alpha: angulo desde la horizontal en PI radianes
     * @return punto nuevo
     */
    public static Point generaPunto(Point uno, double r, double alpha) {
        int x = (int) ((double) uno.x + r * Math.cos(alpha * Math.PI));
        int y = (int) ((double) uno.y - r * Math.sin(alpha * Math.PI));
        Point p = new Point(x, y);
        return p;
    }

    /**
     *
     * @param a punto de referencia
     * @param b otro punto
     * @return el ángulo con respecto a la horizontal
     */
    public static float get_PI(Point a, Point b) {
        float angulo, alto, ancho;
        alto = b.y - a.y;
        ancho = b.x - a.y;
        angulo = (float) Math.atan2(-(double) alto, (double) ancho);
        return (angulo / (float) Math.PI);
    }
    /**
     * 
     * @param x1
     * @param y1
     * @param x2
     * @param y2
     * @return 
     */
    public static float get_PI(int x1, int y1, int x2, int y2) {
        return get_PI(new Point(x1, y1), new Point(x2, y2));
    }

    /**
     * Distancia en pixeles entre dos puntos
     *
     * @param a
     * @param b
     * @return retorna distancia entre puntos
     */
    public static double distancia_2puntos(Point a, Point b) {
        double distancia = Math.sqrt(((double) a.x - (double) b.x) * ((double) a.x - (double) b.x)
                + ((double) a.y - (double) b.y) * (double) a.y - (double) b.y);
        return distancia;
    }

    /**
     * Distancia en pixeles entre dos puntos
     *
     * @param x1
     * @param y1
     * @param x2
     * @param y2
     * @return
     */
    public static double distancia_2puntos(int x1, int y1, int x2, int y2) {
        return distancia_2puntos(new Point(x1, y1), new Point(x2, y2));
    }
}
