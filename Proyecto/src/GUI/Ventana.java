package GUI;

import Objetos.Dibujo;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.*;

public class Ventana extends JFrame implements ActionListener, KeyListener {

    Dibujo dibujo = new Dibujo();

    public Ventana() {
        setSize(1200, 700);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.getContentPane().setBackground(Color.GREEN);
        this.setResizable(false);
        this.add(dibujo, BorderLayout.CENTER);
        this.setVisible(true);
        this.addKeyListener(this);
        this.setFocusable(true);

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
        switch (e.getKeyCode()) {
            case 40 -> {
                dibujo.MoverAbajo();
                repaint();
            }
            case 38 -> {
                dibujo.MoverArriba();
                repaint();
            }
            case 39 -> {
                dibujo.MoverDerecha();
                repaint();
            }
            case 37 -> {
                dibujo.MoverIzquierda();
                repaint();
            }
        }
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
