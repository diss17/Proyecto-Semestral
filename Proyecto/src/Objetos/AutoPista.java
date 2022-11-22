package Objetos;

import java.awt.*;

public class AutoPista {

    private int x;
    private int y;//Coordenada x e y de la autopista

    public AutoPista(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void paint(Graphics g) {
        g.setColor(new Color(159, 159, 159));
        g.fillOval(x, y, 700, 700);
        g.setColor(new Color(24, 129, 55));
        g.fillOval(x + 150, y + 150, 400, 400);
        g.setColor(Color.WHITE);
    }

}
