package Objetos;

import java.awt.*;

public class AutoPista {

    public AutoPista() {

    }

    public void paint(Graphics g) {
        //PAINT CARRETERA.
        //Carretera RECTAS
        //Pista recta 1
        g.setColor(Color.LIGHT_GRAY);
        g.fillRect(200, 60, 1020, 100);

        //Pista recta 2
        g.setColor(Color.LIGHT_GRAY);
        g.fillRect(320, 246, 900, 100);

        //Pista recta 3
        g.setColor(Color.LIGHT_GRAY);
        g.fillRect(320, 433, 910, 100);

        //Pista recta 4
        g.setColor(Color.LIGHT_GRAY);
        g.fillRect(200, 620, 1030, 100);

        //Recta de la izquierda
        g.setColor(Color.LIGHT_GRAY);
        g.fillRect(100, 160, 100, 460);

        
        //Linea Salida
        g.setColor(Color.black);
        g.fillRect(590, 60, 30, 100);
        //Linea de Meta
        g.setColor(Color.white);
        g.fillRect(560, 60, 30, 100);

        //Carretera CURVAS
        //(x,y,tamaño ancho,largo,arco de inicio en grd, arco final en grd, tipo de arco)
        
        g.setColor(Color.LIGHT_GRAY);
        //Curva baja pista izquierda
        g.fillArc(100, 520, 210, 200, -180, 90);
        
        //Curva arriba pista izquierda
        g.setColor(Color.LIGHT_GRAY);
        g.fillArc(100, 60, 210, 200, 180, -90);

        //Tres curvas restantes
        g.setColor(Color.LIGHT_GRAY);
        g.fillArc(1120, 60, 200, 286, 90, -180);

        g.setColor(Color.LIGHT_GRAY);
        g.fillArc(230, 246, 200, 287, 90, 180);
        
        g.setColor(Color.LIGHT_GRAY);
        g.fillArc(1120, 433, 210, 286, 90, -180);

    }

}
