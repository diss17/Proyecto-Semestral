package GUI;

import java.awt.*;
import javax.swing.*;

public class Ventana extends JFrame {

    public Ventana() {
        this.setTitle("Simulación Auto");
        PanelPrincipal p = new PanelPrincipal();
        Botones b = new Botones(p);
        p.setFocusable(true);
        this.setLayout(new BorderLayout());
        super.setSize(p.dim);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.add(p, BorderLayout.CENTER);
        this.add(b, BorderLayout.SOUTH);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        this.setResizable(true);
    }
}
