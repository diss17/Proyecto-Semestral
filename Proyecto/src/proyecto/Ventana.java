package proyecto;
import java.awt.*;
import javax.swing.*;

public class Ventana extends JFrame {
    public Ventana(){
        setSize(800,800);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.getContentPane().setBackground(Color.GREEN);
        this.add(new Dibujo( ),BorderLayout.CENTER);
        this.setVisible(true);
   
    }
    
}
