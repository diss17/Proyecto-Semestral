package Objetos;

import Fisicas.Angulos;

import java.awt.*;

/**
 * Clase encargada de crear las ruedas de nuestro auto
 *
 * @author Franchesca Mora
 * @author Gaspar Jimenez
 * @author Daniel Soto
 */
public class Ruedas {

    private double x, y;
    private double angulo, anguloGiro = 0, dim;
    private Point centro, a, b, c, d;

    Polygon rueda;

    /**
     * Constructor vacio
     */
    public Ruedas() {

    }

    /**
     * Meotodo utilizado para pintar/dibujas los componentes de las ruedas
     *
     * @param g
     */
    public void paint(Graphics g) {

        g.setColor(Color.BLACK);
        Point or = new Point((int) x, (int) y);
        a = Angulos.generaPunto(centro, dim / 189.63, angulo + 0.335 + anguloGiro);
        b = Angulos.generaPunto(centro, dim / 189.63, angulo + 0.665 + anguloGiro);
        c = Angulos.generaPunto(centro, dim / 189.63, angulo - 0.665 + anguloGiro);
        d = Angulos.generaPunto(centro, dim / 189.63, angulo - 0.335 + anguloGiro);
        Angulos.distancia_2puntos(a, c);
        rueda = new Polygon();
        rueda.addPoint(a.x, a.y);
        rueda.addPoint(b.x, b.y);
        rueda.addPoint(c.x, c.y);
        rueda.addPoint(d.x, d.y);
        g.fillPolygon(rueda);
    }

    /**
     * Metodo encargado de settear las propiedades de las ruedas mediante
     * distintos parametros
     *
     * @param x Coordenada x
     * @param y Coordenad Y
     * @param dim Dimension de las ruedas
     */
    public void setXY(double x, double y, double dim) {
        this.x = x;
        this.y = y;
        this.dim = dim;
    }

    /**
     * Metodo que recibe un parametro el cual inicializa el angulo de las ruedas
     *
     * @param angulo
     */
    public void setAngulo(double angulo) {
        this.angulo = angulo;
    }

    /**
     * Metodo encargado de retonar el centro entre las 4 ruedas
     *
     * @param centro
     */
    public void getCentro(Point centro) {
        this.centro = centro;
    }

    /**
     * Metodo que se encarga de rotar las ruedas hacia la izquierda segun
     * corresponda
     *
     * @param angulo
     */
    public void rotarIzq(double angulo) {
        if (anguloGiro < 0.15) {
            anguloGiro += angulo;
        }
    }

    /**
     * Metodo que se encarga de rotar las ruedas hacia la derecha segun
     * corresponda
     *
     * @param angulo
     */
    public void rotarDer(double angulo) {
        if (anguloGiro > -0.15) {
            anguloGiro -= angulo;
        }
    }

    /**
     * Metodo el cual se encarga de devolver a 0 el giro de las ruedas, segun
     * sea necesario
     */
    public void resetAnguloGiro() {
        anguloGiro = 0;
    }

}
