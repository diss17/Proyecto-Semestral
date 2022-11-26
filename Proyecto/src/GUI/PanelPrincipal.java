package GUI;
import Objetos.Automovil;
import Objetos.AutoPista;
import javax.swing.Timer;
import javax.swing.JPanel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class PanelPrincipal extends JPanel implements ActionListener, KeyListener {

    public Dimension dim = super.getToolkit().getScreenSize();
    private Timer t;
    private Automovil a;
    private AutoPista p;
    private String vel;
    private int inicioX = 400, inicioY = 50; // variara dependiendo de la pista
    private int cont_colisiones=0;
    private double giro = 0;

    public PanelPrincipal() {
        giro = -3.00;
        addKeyListener(this);
        t = new Timer(10, null);
        a = new Automovil(inicioX - 300, inicioY + 50, dim.width, Color.RED);
        p = new AutoPista();
        this.setBackground(Color.CYAN);
        t.addActionListener(this);
        t.start();
    }

    public void frenos() {
        a.desacelerar(); 
        this.repaint();
    }
    public void avanzar(){
        a.acelerar();
        this.repaint();
    }
    public void derecha(){
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
        switch (s){
            case "[1]Velocidad Maxima: 30":
                a.setVel(3.0);
                break;
            case "[2]Velocidad Maxima: 50":
                a.setVel(5.0);
                break;
            case "[3]Velocidad Maxima: 100":
                a.setVel(10.0);
                break;
            default: a.setVel(0.0);    
        }
    }

    public void paint(Graphics g) {
        super.paint(g);    
        g.setColor(Color.BLACK);
        g.setFont(new Font("Impact", Font.PLAIN, 20));
        g.drawString("Velocidad: ",  (int)(dim.width * 0.91), (int)(dim.height * 0.035));
        g.drawString("Colisiones: ",  (int)(dim.width * 0.91), (int)(dim.height * 0.13));
        g.setFont(new Font("Impact", Font.PLAIN, 25));
        g.setColor(Color.BLACK);
        if(((int)(a.getVel() * 10)<0)){
            g.drawString("0" + " Km/h", (int)(dim.width * 0.91), (int)(dim.height * 0.085));
        }else{
            g.drawString(Integer.toString((int)(a.getVel() * 10)) + " Km/h", (int)(dim.width * 0.91), (int)(dim.height * 0.085));
        }      
        if(a.getX() > 0 && a.getX() < dim.width - 30 && a.getY() > 0 && a.getY() < dim.height - 100){
            g.drawString(String.valueOf(cont_colisiones), (int)(dim.width * 0.91), (int)(dim.height * 0.17));
        }
        else{
            a = new Automovil(inicioX - 300, inicioY + 50, dim.width, Color.RED);
            cont_colisiones++;
        }
        p.paint(g);
        a.paint(g);
    }
    @Override
    public void keyTyped(KeyEvent e) {
        // TODO Auto-generated method stub

    }

    @Override
    public void keyPressed(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_RIGHT){ 
            derecha();
            a.getR1().rotarDer(0.01);
            a.getR2().rotarDer(0.01);
            this.repaint();
        }
        if (e.getKeyCode() == KeyEvent.VK_LEFT){
            izquieda();
            a.getR1().rotarIzq(0.01);
            a.getR2().rotarIzq(0.01);
            this.repaint();
        }
        if (e.getKeyCode() == KeyEvent.VK_DOWN){
            frenos();
            this.repaint();
        }
        if(e.getKeyCode() == KeyEvent.VK_UP){
            a.maxvelset(3.0);
            a.velset(3.0);
            this.repaint();
        }
        if(e.getKeyCode() == KeyEvent.VK_0){
            a.velset(0.0);
            a.maxvelset(0.0);
            this.repaint();
        }
        if(e.getKeyCode() == KeyEvent.VK_1){
            pasa_cambios("[1]Velocidad Maxima: 30");
        }
        if(e.getKeyCode() == KeyEvent.VK_2){
            pasa_cambios("[2]Velocidad Maxima: 50");
        }
        if(e.getKeyCode() == KeyEvent.VK_3){
            pasa_cambios("[3]Velocidad Maxima: 100");
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
        a.getR1().resetAnguloGiro();
        a.getR2().resetAnguloGiro();
        this.repaint();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (a.getX() > 0 && a.getX() < dim.width - 30 && a.getY() > 0 && a.getY() < dim.height - 100) a.acelerar();
        this.repaint();
    }
}
