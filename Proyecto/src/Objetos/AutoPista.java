package Objetos;

import java.awt.*;

public class AutoPista {

    Rectangle l1 = new Rectangle();
    Rectangle l2 = new Rectangle();
    Rectangle meta = new Rectangle();
    Rectangle salida = new Rectangle();

    public AutoPista() {
        l1.x = 200;
        l1.y = 60;
        l1.width = 1020;
        l1.height = 550;

        l2.x = 300;
        l2.y = 140;
        l2.width = 820;
        l2.height = 400;

        meta.x = 700;
        meta.y = 60;
        meta.width = 30;
        meta.height = 80;

        salida.x = 670;
        salida.y = 60;
        salida.width = 30;
        salida.height = 80;
    }

    public void paint(Graphics g) {
        //PAINT CARRETERA.
        //Carretera RECTAS
        //Pista recta 1
        Color pista1 = new Color(102, 115, 100);
        g.setColor(pista1);
        g.fillRoundRect(l1.x, l1.y, l1.width, l1.height, 90, 90);

        //Pista recta 2
        Color pista2 = new Color(100, 215, 133);
        g.setColor(pista2);
        g.fillRoundRect(l2.x, l2.y, l2.width, l2.height, 90, 90);

        //Linea Salida
        g.setColor(Color.black);
        g.fillRect(salida.x, salida.y, salida.width, salida.height);
        //Linea de Meta
        g.setColor(Color.white);
        g.fillRect(meta.x, meta.y, meta.width, meta.height);
        ////
////        //Pista recta 3
////        g.setColor(Color.LIGHT_GRAY);
////        g.fillRect(320, 433, 910, 100);
////
////        //Pista recta 4
////        g.setColor(Color.LIGHT_GRAY);
////        g.fillRect(200, 620, 1030, 100);
////
////        //Recta de la izquierda
////        g.setColor(Color.LIGHT_GRAY);
////        g.fillRect(100, 160, 100, 460);
////
////        
////
////        //Carretera CURVAS
////        //(x,y,tamaño ancho,largo,arco de inicio en grd, arco final en grd, tipo de arco)
////        
////        g.setColor(Color.LIGHT_GRAY);
////        //Curva baja pista izquierda
////        g.fillArc(100, 520, 210, 200, -180, 90);
////        
////        //Curva arriba pista izquierda
////        g.setColor(Color.LIGHT_GRAY);
////        g.fillArc(100, 60, 210, 200, 180, -90);
////
////        //Tres curvas restantes
////        g.setColor(Color.LIGHT_GRAY);
////        g.fillArc(1120, 60, 200, 286, 90, -180);
////
////        g.setColor(Color.LIGHT_GRAY);
////        g.fillArc(230, 246, 200, 287, 90, 180);
////        
////        g.setColor(Color.LIGHT_GRAY);
////        g.fillArc(1120, 433, 210, 286, 90, -180);

    }

    public Rectangle Exterior() {
        return l1;
    }

    public Rectangle Interior() {
        return l2;
    }
}
