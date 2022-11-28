package GUI;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;

public class Aceleracion extends JButton implements ActionListener {

    private String m;
    private PanelPrincipal b;

    public Aceleracion(String m, PanelPrincipal b) {
        super(m);
        this.b = b;
        this.m = m;
        addActionListener(this);
        this.setFocusable(false);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        b.pasa_cambios(m);
    }
}
