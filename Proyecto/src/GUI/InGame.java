package GUI;

import Fisicas.BoxCollider;
import Objetos.AutoPista;
import Objetos.Automovil;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JPanel;
import javax.swing.Timer;

public class InGame extends JPanel implements ActionListener, KeyListener {

    public Dimension dim = new Dimension(1200, 700);
    BoxCollider colision = new BoxCollider();
    private Timer t;
    private Automovil a;
    private AutoPista p;
    private String vel;
    private int inicioX = 585, inicioY = 80; // variara dependiendo de la pista
    private int cont_colisiones = 0;
    private int cont_vueltas = 0;
    private double giro = 0;
    JPanel panel;
    boolean autoenmeta;
    public InGame() {
        giro = -0.5;
//        addKeyListener(this);
        t = new Timer(10, null);
        a = new Automovil(inicioX, inicioY, dim.width - 400, Color.RED);
        p = new AutoPista();
        Color bck = new Color(67, 155, 52);
        this.setBackground(bck);
        t.addActionListener(this);
        t.start();
        super.setSize(dim);
    }
    

    public void frenos() {
        a.desacelerar();
        this.repaint();
    }

    public void avanzar() {
        Sonido Actual;
        Actual = new Sonido();
        Actual.ReproducirSonido("src/aceleracion_1.wav");
        a.acelerar();
        this.repaint();
    }

    public void derecha() {
        giro -= 0.02;
        a.girar(giro);
        this.repaint();
    }

    public void izquieda() {
        giro += 0.02;
        a.girar(giro);
        this.repaint();
    }

    public void pasa_cambios(String s) {
        switch (s) {
            case "[1]Velocidad Maxima: 30":
                System.out.println("a");
                a.setVel(3.0);
                break;
            case "[2]Velocidad Maxima: 50":
                a.setVel(5.0);
                break;
            case "[3]Velocidad Maxima: 100":
                a.setVel(10.0);
                break;
            default:
                a.maxvelset(0.0);
        }
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.setColor(Color.BLACK);
        g.setFont(new Font("Impact", Font.PLAIN, 20));
        g.drawString("Velocidad: ", (int) (dim.width * 0.91), (int) (dim.height * 0.035));

        g.setFont(new Font("Impact", Font.PLAIN, 20));
        g.setColor(Color.BLACK);
        g.drawString("Colisiones: ", (int) (dim.width * 0.91), (int) (dim.height * 0.13));

        g.setFont(new Font("Impact", Font.PLAIN, 20));
        g.setColor(Color.BLACK);
        g.drawString("Vueltas: ", (int) (dim.width * 0.91), (int) (dim.height * 0.21));

        if (((int) (a.getVel() * 10) < 0)) {
            g.drawString("0" + " Km/h", (int) (dim.width * 0.91), (int) (dim.height * 0.085));
        } else {
            g.drawString(Integer.toString((int) (a.getVel() * 10)) + " Km/h", (int) (dim.width * 0.91), (int) (dim.height * 0.085));
        }
        if (a.getX() > 0 && a.getX() < dim.width - 30 && a.getY() > 0 && a.getY() < dim.height - 100) {
            g.drawString(String.valueOf(cont_colisiones), (int) (dim.width * 0.91), (int) (dim.height * 0.17));
        } else {
            a = new Automovil(inicioX - 300, inicioY + 50, dim.width - 400, Color.RED);
            giro = -0.5;
            cont_colisiones++;
        }
        if (colision.CheckColliderInt(a, p.Interior()) == true) {
            cont_colisiones++;
            a = new Automovil(inicioX, inicioY, dim.width - 400, Color.RED);
            giro = -0.5;
        }
        if (colision.CheckColliderExt(a, p.Exterior()) == true) {
            cont_colisiones++;
            a = new Automovil(inicioX, inicioY, dim.width - 400, Color.RED);
            giro = -0.5;
        }
        if (colision.CheckColliderMeta(a, p.Meta()) == true && !autoenmeta) {
            autoenmeta = true;
            cont_vueltas++;
//            a = new Automovil(inicioX, inicioY, dim.width - 400, Color.RED);
            giro = -0.5;
        }if(colision.CheckColliderMeta(a, p.Meta()) == false) {
            autoenmeta = false;
            //g.drawString(String.valueOf(cont_vueltas), (int) (dim.width * 0.91), (int) (dim.height * 0.25));
        }
        g.drawString(String.valueOf(cont_vueltas), (int) (dim.width * 0.91), (int) (dim.height * 0.25));
        p.paint(g);
        a.paint(g);
    }

    @Override
    public void keyTyped(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_UP) {
            avanzar();
            this.repaint();
        }
    }

    @Override
    public void keyPressed(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
            derecha();
            a.getR1().rotarDer(0.01);
            a.getR2().rotarDer(0.01);
            this.repaint();
        }
        if (e.getKeyCode() == KeyEvent.VK_LEFT) {
            izquieda();
            a.getR1().rotarIzq(0.01);
            a.getR2().rotarIzq(0.01);
            this.repaint();
        }
        if (e.getKeyCode() == KeyEvent.VK_DOWN) {
            frenos();
            this.repaint();
        }
        if (e.getKeyCode() == KeyEvent.VK_UP) {
            a.maxvelset(3.0);
            a.acelerar();
            this.repaint();
        }
        if (e.getKeyCode() == KeyEvent.VK_0) {
            a.velset(0.0);
            a.maxvelset(0.0);
            this.repaint();
        }
        if (e.getKeyCode() == KeyEvent.VK_1) {
            pasa_cambios("[1]Velocidad Maxima: 30");
        }
        if (e.getKeyCode() == KeyEvent.VK_2) {
            pasa_cambios("[2]Velocidad Maxima: 50");
        }
        if (e.getKeyCode() == KeyEvent.VK_3) {
            pasa_cambios("[3]Velocidad Maxima: 100");
        }

    }

    @Override
    public void keyReleased(KeyEvent e) {
        a.getR1().resetAnguloGiro();
        a.getR2().resetAnguloGiro();
        pasa_cambios("");
        a.desacelerar();
        this.repaint();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (a.getX() > 0 && a.getX() < dim.width - 30 && a.getY() > 0 && a.getY() < dim.height - 100) {
            a.acelerar();
        }
        this.repaint();
    }
}
