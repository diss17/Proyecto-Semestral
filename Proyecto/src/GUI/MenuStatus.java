package GUI;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;

public class MenuStatus extends JPanel implements ActionListener {

    JPanel panel, menu;
    JLabel fondo, titulo;
    CardLayout c = new CardLayout();
    InGame juego = new InGame();
    JButton Iniciar, Salir;
    JFrame ventana;

    public MenuStatus(JFrame ventana) {
        this.ventana = ventana;
        IniciarPaneles();
        botonesMenu();
        fondoMenu();
        ventana.add(panel);
        ventana.addKeyListener(juego);

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

        //BOTON-PLAY
        Iniciar = new JButton();
        Iniciar.setBounds(530, 360, 120, 50);
        Iniciar.setBackground(Color.BLACK);
        Iniciar.setBorderPainted(true);
        Iniciar.setBorder(new LineBorder(Color.WHITE));
        Iniciar.setEnabled(true);
        Iniciar.setText("PLAY");
        Iniciar.setForeground(Color.WHITE);
        Iniciar.setFont(new Font("Impact", Font.PLAIN, 18));
        Iniciar.addActionListener(this);
        Iniciar.setFocusable(false);
        menu.add(Iniciar);

        //BOTON-EXIT
        Salir = new JButton();
        Salir.setBounds(530, 430, 120, 50);
        Salir.setBackground(Color.BLACK);
        Salir.setOpaque(true);
        Salir.setBorderPainted(true);
        Salir.setBorder(new LineBorder(Color.WHITE));
        Salir.setEnabled(true);
        Salir.setText("EXIT");
        Salir.setFont(new Font("Impact", Font.PLAIN, 18));
        Salir.setForeground(Color.WHITE);
        Salir.addActionListener(this);
        Salir.setFocusable(false);
        menu.add(Salir);
    }

    private void fondoMenu() {
        titulo = new JLabel();
        titulo.setBounds(450, 250, 400, 40);
        titulo.setOpaque(false);
        titulo.setBackground(null);
        titulo.setText("RUN RUN CAR");
        titulo.setForeground(Color.WHITE);
        titulo.setFont(new Font("Impact", Font.BOLD, 50));
        menu.add(titulo);

        fondo = new JLabel();
        ImageIcon fondoMenu = new ImageIcon("fondo_menu.png.jpg");
        fondo.setIcon(new ImageIcon(fondoMenu.getImage().getScaledInstance(1200, 700, Image.SCALE_SMOOTH)));
        fondo.setOpaque(false);
        fondo.setBounds(-10, -20, 1200, 700);
        menu.add(fondo);

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
