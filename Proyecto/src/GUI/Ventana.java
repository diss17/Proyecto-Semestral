package GUI;

import javax.swing.*;

/**
 * Clase que crea y da propiedades a la ventana principal
 *
 * @author Gaspar Jimenez
 * @author Franchesca Mora
 * @author Daniel Soto
 */
public class Ventana extends JFrame {
    /**
     * Metodo constructor que incializa las propiedades de nuestra ventana
     */
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
