package Objetos;

import Fisicas.Angulos;

import java.awt.*;
public class Ruedas {
    private double x,y;
    private double angulo, anguloGiro = 0, dim;
    private Point centro,a,b,c,d;

    public Ruedas(){

    }
    public void paint(Graphics g){

        g.setColor(Color.BLACK);
        Polygon rueda = new Polygon();
        Point or = new Point((int)x, (int)y);
        a = Angulos.generaPunto(centro, dim / 189.63, angulo + 0.335 + anguloGiro);
        b = Angulos.generaPunto(centro, dim / 189.63, angulo + 0.665 + anguloGiro);
        c = Angulos.generaPunto(centro, dim / 189.63, angulo - 0.665 + anguloGiro);
        d = Angulos.generaPunto(centro, dim / 189.63, angulo - 0.335 + anguloGiro);
        Angulos.distancia_2puntos(a, c);
        rueda.addPoint(a.x, a.y);
        rueda.addPoint(b.x, b.y);
        rueda.addPoint(c.x, c.y);
        rueda.addPoint(d.x, d.y);
        g.fillPolygon(rueda);
    }
    public void setXY(double x, double y, double dim){
        this.x = x; 
        this.y = y;
        this.dim = dim;
    }
    public void setAngulo(double angulo){
        this.angulo = angulo;
    }
    public void getCentro(Point centro){
        this.centro = centro;
    }
    public void rotarIzq(double angulo){
        if(anguloGiro < 0.15) anguloGiro += angulo; 
    }
    public void rotarDer(double angulo){
        if (anguloGiro > -0.15) anguloGiro -= angulo;
    }
    public void resetAnguloGiro(){
        anguloGiro = 0;
    }
}
