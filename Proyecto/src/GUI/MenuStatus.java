package GUI;

import java.awt.CardLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class MenuStatus extends JPanel implements ActionListener {

    JPanel panel;
    JPanel menu;
    CardLayout c = new CardLayout();
    InGame juego = new InGame();
    JButton Iniciar, Salir;
    JFrame ventana;

    public MenuStatus(JFrame ventana) {
        this.ventana = ventana;
        IniciarPaneles();
        botonesMenu();
        ventana.add(panel);
        ventana.addKeyListener(juego);
        Botones buttons = new Botones(juego);
        panel.add(buttons);
    }

    private void IniciarPaneles() {
        panel = new JPanel();
        menu = new JPanel();
        panel.setLayout(c);

        menu.setLayout(null);
        panel.add(menu);
        panel.add(juego);

    }

    private void botonesMenu() {
        Iniciar = new JButton();
        Iniciar.setBounds(390, 100, 300, 50);
        Iniciar.setText("Play");
        Iniciar.addActionListener(this);
        Iniciar.setFocusable(false);
        menu.add(Iniciar);

        Salir = new JButton();
        Salir.setBounds(390, 300, 300, 50);
        Salir.setText("Exit");
        Salir.addActionListener(this);
        Salir.setFocusable(false);
        menu.add(Salir);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == Iniciar) {
            //Cambiamos al panel ProgramaIniciado
            menu.setVisible(false);
            c.show(panel, "2");
            juego.requestFocus();
            juego.setVisible(true);

        }
        if (e.getSource() == Salir) {
            System.exit(0);
        }

    }
}
