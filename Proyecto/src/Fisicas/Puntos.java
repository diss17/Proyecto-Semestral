package Fisicas;

import java.awt.*;

public class Puntos {
    public synchronized static void nueva_linea(Point a, Point b,Polygon p){
        nueva_linea(a.x,a.y,b.x,b.y,p);
    }
    public synchronized static void nueva_linea(int x1,int y1,int x2,int y2,Polygon p){
        int val_y=0;
        if(x1 == x2 && y1==y2)
        return;

        if(y1>y2)val_y = y1-y2-1; else val_y = y2-y1-1;
        int val_x=0;

        if(x1>x2)val_x = x1-x2-1; else val_x = x2-x1-1;
        int val;

        if(val_y>val_x)val=val_y; else val=val_x;

        if(val<1) return;

        if(val_y>val_x){
            if(val_y>0){creaLineaY(x1,y1,x2,y2,val,p); return;}
            else return;
        }else{
            if(val_x>0){creaLineaX(x1,y1,x2,y2,val,p); return;}
            else return;
        }
    }

    private static void creaLineaX(int ax1,int ay1,int bx1,int by2,int val,Polygon p){
        double m = (((double)by2-(double)ay1))/(((double)bx1-(double)ax1));
        String borrar = Double.toString(m);
        if(borrar.endsWith("-Infinity")||borrar.endsWith("Infinity")){
            for(int i = 1;i<val+1;i++){
                if(ax1<bx1)p.addPoint(ax1, ay1+i);
                else p.addPoint(ax1, ay1-i);
            }
        }else{
            double d = (double)ay1-m*(double)ax1;
            for(int i=0;i<val;i++){
                int yi;
                if(ax1<bx1){
                    yi = (int)((double)(ax1+i)*m+(double)d);
                    p.addPoint(ax1+i, yi);
                }else{
                    yi = (int)((double)(ax1-i)*m+(double)d);
                    p.addPoint(ax1-i, yi);
                }
            }
        }
    }
    private static void creaLineaY(int ax1,int ay1,int bx1,int by1,int val,Polygon p){
        double m = (((double)by1-(double)ay1))/(((double)bx1-(double)ax1));
        String borrar = Double.toString(m);
        if(borrar.endsWith("-Infinity")||borrar.endsWith("Infinity")){
            for(int i = 1;i<val+1;i++){
                if(ax1<bx1)p.addPoint(ax1, ay1+i);
                else p.addPoint(ax1, ay1-i);
            }
        }else{
            double d = (double)ay1-m*(double)ax1;
            for(int i=0;i<val+1;i++){
                int xi;
                if(ax1<bx1){
                    xi = (int)(((double)(ax1+i)-(double)d)/m);
                    p.addPoint(xi, ay1+i);
                }else{
                    xi = (int)(((double)(ax1-i)-(double)d)/m);
                    p.addPoint(xi, ay1-i);
                }
            }
        }
    }
}
