package GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Botones extends JPanel{
    public Botones(PanelPrincipal p){
        JButton apagado = new JButton("[0]Apagar vehiculo");
        Aceleracion x3 = new Aceleracion("[1]Velocidad Maxima: 30", p);
        Aceleracion x5 = new Aceleracion("[2]Velocidad Maxima: 50", p);
        Aceleracion x10 = new Aceleracion("[3]Velocidad Maxima: 100", p);
        this.add(apagado);
        this.add(x3);
        this.add(x5);
        this.add(x10);
    }
}
class Aceleracion extends JButton implements ActionListener{
    private String m;
    private PanelPrincipal b;
    public Aceleracion(String m, PanelPrincipal b){
        super(m);
        this.b = b;
        this.m = m;
        addActionListener(this);
        this.setFocusable(false);
    }
    public void actionPerformed(ActionEvent e) {
        b.pasa_cambios(m);
    }
}
