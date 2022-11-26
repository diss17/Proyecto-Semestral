package Objetos;

import java.awt.*;
import Fisicas.Angulos;


public class Automovil {

    private double x,y;
    private Color color;
    private Ruedas r1,r2,r3,r4;
    private double vel = 0.01, maxVel = 3, angulo = 0, dim;

    public Automovil(double x, double y, double dim, Color color){
        angulo = -3.00;
        this.x = x;
        this.y = y;
        this.color = color;
        this.dim = dim;
        r1 = new Ruedas();
        r2 = new Ruedas(); 
        r3 = new Ruedas();
        r4 = new Ruedas();
    }
    public void paint(Graphics g){
        Point or = new Point((int)x, (int)y);
        r1.getCentro(Angulos.generaPunto(or, dim / 67.66, angulo + 0.23));
        r2.getCentro(Angulos.generaPunto(or, dim / 67.66, angulo + 0.77));
        r3.getCentro(Angulos.generaPunto(or, dim / 67.66, angulo - 0.77));
        r4.getCentro(Angulos.generaPunto(or, dim / 67.66, angulo - 0.23));
        r1.setXY(x, y, dim);
        r2.setXY(x, y, dim);
        r3.setXY(x, y, dim);
        r4.setXY(x, y, dim);
        r1.setAngulo(angulo);
        r2.setAngulo(angulo);
        r3.setAngulo(angulo);
        r4.setAngulo(angulo);
        r1.paint(g);
        r2.paint(g);
        r3.paint(g);
        r4.paint(g);
        g.setColor(color);
        Polygon car = new Polygon();
        Point a = Angulos.generaPunto(or, dim / 45.17, angulo + 0.34388);
        Point b = Angulos.generaPunto(or, dim / 45.17, angulo + 0.65611);
        Point c = Angulos.generaPunto(or, dim / 45.17, angulo - 0.34388);
        Point d = Angulos.generaPunto(or, dim / 45.17, angulo - 0.65611);
        car.addPoint(a.x,a.y);
        car.addPoint(b.x,b.y);
        car.addPoint(d.x,d.y);
        car.addPoint(c.x,c.y);
        g.fillPolygon(car);
        g.setColor(Color.BLACK);
        g.drawPolygon(car);

        Polygon win1 = new Polygon();
        Polygon win2 = new Polygon();
        Polygon win3 = new Polygon();
        Polygon win4 = new Polygon();
        Polygon foco1 = new Polygon();
        Polygon foco2 = new Polygon();
        
        Point win1a = Angulos.generaPunto(or, dim / 83.48, angulo + 0.2255);
        Point win1b = Angulos.generaPunto(or, dim / 74.92, angulo - 0.2611);
        Point win1c = Angulos.generaPunto(or, dim / 80, angulo - 0.285);
        Point win1d = Angulos.generaPunto(or, dim / 90.35, angulo + 0.25);
        win1.addPoint(win1a.x, win1a.y);
        win1.addPoint(win1b.x, win1b.y);
        win1.addPoint(win1c.x, win1c.y);
        win1.addPoint(win1d.x, win1d.y);
        
        Point win2a = Angulos.generaPunto(or, dim / 90.35, angulo + 0.75);
        Point win2b = Angulos.generaPunto(or, dim / 83.48, angulo + 0.7744);
        Point win2c = Angulos.generaPunto(or, dim / 74.92, angulo - 0.7388);
        Point win2d = Angulos.generaPunto(or, dim / 80, angulo - 0.715);
        win2.addPoint(win2b.x, win2b.y);
        win2.addPoint(win2a.x, win2a.y);
        win2.addPoint(win2d.x, win2d.y);
        win2.addPoint(win2c.x, win2c.y);
       
        Point win3a = Angulos.generaPunto(or, dim / 63.47, angulo + 0.3644);
        Point win3b = Angulos.generaPunto(or, dim / 89.3, angulo + 0.30277);
        Point win3c = Angulos.generaPunto(or, dim / 89.3, angulo + 0.69722);
        Point win3d = Angulos.generaPunto(or, dim / 63.47, angulo + 0.63555);
        win3.addPoint(win3a.x, win3a.y);
        win3.addPoint(win3b.x, win3b.y);
        win3.addPoint(win3c.x, win3c.y);
        win3.addPoint(win3d.x, win3d.y);
        
        Point win4a = Angulos.generaPunto(or, dim / 87.77, angulo - 0.32722);
        Point win4b = Angulos.generaPunto(or, dim / 64.53, angulo - 0.37555);
        Point win4c = Angulos.generaPunto(or, dim / 64.53, angulo - 0.62444);
        Point win4d = Angulos.generaPunto(or, dim / 87.77, angulo - 0.67277);
        win4.addPoint(win4a.x, win4a.y);
        win4.addPoint(win4b.x, win4b.y);
        win4.addPoint(win4c.x, win4c.y);
        win4.addPoint(win4d.x, win4d.y);
        
        Point foco1a = Angulos.generaPunto(or, dim / 49.07, angulo + 0.35222);
        Point foco1b = Angulos.generaPunto(or, dim / 52.06, angulo + 0.34277); 
        Point foco1c = Angulos.generaPunto(or, dim / 55.05, angulo + 0.38333);
        Point foco1d = Angulos.generaPunto(or, dim / 51.72, angulo + 0.39055);
        foco1.addPoint(foco1a.x, foco1a.y);
        foco1.addPoint(foco1b.x, foco1b.y);
        foco1.addPoint(foco1c.x, foco1c.y);
        foco1.addPoint(foco1d.x, foco1d.y);
        
        Point foco2a = Angulos.generaPunto(or, dim / 51.72, angulo + 0.60944);
        Point foco2b = Angulos.generaPunto(or, dim / 55.05, angulo + 0.61666); 
        Point foco2c = Angulos.generaPunto(or, dim / 52.06, angulo + 0.65722);
        Point foco2d = Angulos.generaPunto(or, dim / 49.07, angulo + 0.64777);
        foco2.addPoint(foco2a.x, foco2a.y);
        foco2.addPoint(foco2b.x, foco2b.y);
        foco2.addPoint(foco2c.x, foco2c.y);
        foco2.addPoint(foco2d.x, foco2d.y);
        
        g.fillPolygon(win1);
        g.fillPolygon(win2);
        g.fillPolygon(win3);
        g.fillPolygon(win4);
        g.drawPolygon(foco1);
        g.drawPolygon(foco2);
        
        g.setColor(Color.YELLOW);
        g.fillPolygon(foco1);
        g.fillPolygon(foco2);    
    }
    public void acelerar(){
        double avanzax = Math.sin(angulo * Math.PI), avanzay = Math.cos(angulo * Math.PI);
        if (vel < maxVel) vel += 0.01;
        if (vel > 0){
           x -= avanzax * vel;
           y -= avanzay * vel;
        }   
    }
    public void desacelerar(){
        if (vel > 0.0) vel -= 0.4;  
    }
    public void maxvelset(double x){
        maxVel = x;
    }
    public void velset(double x2){
        vel = x2;
    }
    public void setVel(double vel){
        if (this.vel > vel) this.vel = vel;
        maxVel = vel;
    }
    public double getVel(){
        return vel;
    }
    
    public void girar(double angulo){
        this.angulo = angulo;

    }
    public double getX(){
        return x;
    }
    public double getY(){
        return y;
    }
    public Ruedas getR1(){
        return r1;
    }
    public Ruedas getR2(){
        return r2;
    }
}




