package GUI;

import javax.swing.*;

/**
 * Clase que crea y da propiedades a la ventana principal
 *
 * @author Gaspar
 * @author Franchesca
 * @author Daniel
 */
public class Ventana extends JFrame {

    public Ventana() {
        MenuStatus m = new MenuStatus(this);
        this.setTitle("Simulación Auto");
        m.setFocusable(true);
        this.setSize(1200, 700);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        this.setResizable(true);
    }
}
