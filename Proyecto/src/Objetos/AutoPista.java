package Objetos;

import java.awt.*;

public class AutoPista {

    public AutoPista() {

    }

    public void paint(Graphics g) {
        //PAINT CARRETERA.
        //Carretera RECTAS
        g.setColor(Color.LIGHT_GRAY);
        g.fillRect(200, 50, 800, 100);

        g.setColor(Color.LIGHT_GRAY);
        g.fillRect(300, 200, 700, 100);

        g.setColor(Color.LIGHT_GRAY);
        g.fillRect(300, 350, 700, 100);

        g.setColor(Color.LIGHT_GRAY);
        g.fillRect(200, 500, 800, 100);

        g.setColor(Color.LIGHT_GRAY);
        g.fillRect(100, 150, 100, 350);

        //Linea Salida
        g.setColor(Color.black);
        g.fillRect(590, 50, 30, 100);
        //Linea de Meta
        g.setColor(Color.white);
        g.fillRect(560, 50, 30, 100);

        //Carretera CURVAS
        //(x,y,tamaño ancho,largo,arco de inicio en grd, arco final en grd, tipo de arco)
        g.setColor(Color.LIGHT_GRAY);
        g.fillArc(100, 400, 210, 200, -180, 90);
        g.setColor(Color.LIGHT_GRAY);
        g.fillArc(100, 50, 210, 200, 180, -90);

        g.setColor(Color.LIGHT_GRAY);
        g.fillArc(900, 50, 190, 250, 90, -180);

        g.setColor(Color.LIGHT_GRAY);
        g.fillArc(210, 200, 190, 250, 90, 180);
        g.setColor(Color.LIGHT_GRAY);
        g.fillArc(900, 350, 190, 250, 90, -180);

    }

}
