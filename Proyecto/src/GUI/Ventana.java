package GUI;

import Objetos.Dibujo;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.*;

public class Ventana extends JFrame implements ActionListener, KeyListener {


    public Ventana() {
        this.setTitle("Simulación Auto");
        PanelPrincipal p = new PanelPrincipal();
        Botones b = new Botones(p);
        p.setFocusable(true);
        this.setLayout(new BorderLayout());
        super.setSize(p.dim);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setExtendedState(MAXIMIZED_BOTH);
        this.add(p, BorderLayout.CENTER);
        this.add(b,BorderLayout.SOUTH);
        this.setVisible(true);
        this.setResizable(true);
    }

    public void frenos() {

    }

    public void derecha() {

    }

    public void izquieda() {

    }

    public void pasa_cambios() {

    }

    public void paint() {

    }

    @Override
    public void keyTyped(KeyEvent e) {
        // TODO Auto-generated method stub

    }

    @Override
    public void keyPressed(KeyEvent e) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void keyReleased(KeyEvent e) {
        // TODO Auto-generated method stub

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub

    }

}
