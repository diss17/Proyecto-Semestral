package Fisicas;

import java.awt.Point;

public class Angulos {
    public static Point generaPunto(Point uno,double r,double alpha){
        int x = (int)((double) uno.x + r*Math.cos(alpha*Math.PI));
        int y = (int)((double) uno.y - r*Math.sin(alpha*Math.PI));
        Point p = new Point(x,y);
        return p;
    }
    public static float get_PI(Point a,Point b){
        float angulo,alto,ancho;
        alto = b.y - a.y;
        ancho = b.x - a.y;
        angulo = (float)Math.atan2(-(double)alto,(double)ancho);
        return(angulo/(float)Math.PI);
    }
    public static float get_PI(int x1,int y1,int x2,int y2){
        return get_PI(new Point(x1,y1),new Point(x2,y2));
    }
    public  static double distancia_2puntos(Point a,Point b){
        double distancia = Math.sqrt(((double)a.x-(double)b.x)*((double)a.x-(double)b.x)+
                                    ((double)a.y-(double)b.y)*(double)a.y-(double)b.y
                                    );
        return distancia;
    }
    public static double distancia_2puntos(int x1,int y1,int x2,int y2){
        return distancia_2puntos(new Point(x1,y1),new Point(x2,y2));
    }
}
