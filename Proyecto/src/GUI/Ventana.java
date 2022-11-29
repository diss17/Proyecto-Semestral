package GUI;

import java.awt.*;
import javax.swing.*;

public class Ventana extends JFrame {

    public Ventana() {
        InGame p=new InGame();
        MenuStatus m=new MenuStatus(this);
        this.setTitle("Simulación Auto");
        p.setFocusable(true);
        this.setSize(1200, 700);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        this.setResizable(true);
    }
}
