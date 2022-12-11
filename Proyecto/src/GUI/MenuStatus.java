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
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import java.io.File;
import java.io.IOException;
import javax.sound.sampled.FloatControl;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

/**
 * Clase encargada de crear el menu de nuestro juego
 *
 * @author Gaspar Jimenez
 * @author Franchesca Mora
 * @author Daniel Soto
 */
public class MenuStatus extends JPanel implements ActionListener {

    JPanel panel, menu;
    JLabel fondo, titulo;
    CardLayout c = new CardLayout();
    InGame juego = new InGame();
    JButton Iniciar, Salir;
    JFrame ventana;
    public static Clip musicMenu;
    public static Clip musicGame;

    /**
     * Constructor que recibe un JFrame el cual da "vida" a nuestra ventana,
     * ademas inicializa los componentes de nuestro menu
     *
     * @param ventana
     */
    public MenuStatus(JFrame ventana) {
        this.ventana = ventana;
        IniciarPaneles();
        botonesMenu();
        fondoMenu();
        ventana.add(panel);
        ventana.addKeyListener(juego);
        musicInGame();

    }

    /**
     * Metodo private el cual inicializada nuestros paneles que contienen el
     * menu y juego
     */
    private void IniciarPaneles() {
        panel = new JPanel();
        menu = new JPanel();
        panel.setLayout(c);

        menu.setLayout(null);
        panel.add(menu);
        panel.add(juego);

    }

    /**
     * Metodo private que crea los botones del menu
     */
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

    /**
     * Metodo private que se encarga de crear la parte grafica del menu
     */
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

    /**
     * Metodo private que se encarga de settear la musica del menu y juego, el
     * cual en caso de fallar lanza una exception
     */
    private void musicInGame() {
        try {
            musicMenu = AudioSystem.getClip();
            musicMenu.open(AudioSystem.getAudioInputStream(new File("GTA_Menu(1).wav")));
            musicMenu.loop(-1);
            setVolumeMenu(0.02f);

            musicGame = AudioSystem.getClip();
            musicGame.open(AudioSystem.getAudioInputStream(new File("NFS_InGame.wav")));
            setVolumeGame(0.02f);

        } catch (IOException | LineUnavailableException | UnsupportedAudioFileException e) {
            System.out.println("Error al lanzar audio" + e);
        }

    }

    /**
     * Metodo encargado de controlar las acciones recibidas por el mouse
     *
     * @param e
     */
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == Iniciar) {
            //Cambiamos al panel ProgramaIniciado
            menu.setVisible(false);
            c.show(panel, "2");
            juego.requestFocus();
            juego.setVisible(true);

            musicMenu.stop();
            musicGame.setMicrosecondPosition(0);
            musicGame.loop(-1);

        }
        if (e.getSource() == Salir) {
            System.exit(0);
        }

    }
    /**
     * Metodo getter que se usa para obtener el volumen de la musica del menu con el fin de controlarla
     * @return 
     */
    public float getVolumeMenu() {
        FloatControl gainControl = (FloatControl) musicMenu.getControl(FloatControl.Type.MASTER_GAIN);
        return (float) Math.pow(10f, gainControl.getValue() / 20f);
    }
    /**
     * Metodo usado para settear el volume a gusto en el menu
     * @param volume 
     */
    public void setVolumeMenu(float volume) {

        if (volume < 0f || volume > 1f) {
            throw new IllegalArgumentException("Volume not valid: " + volume);
        }
        FloatControl gainControl = (FloatControl) musicMenu.getControl(FloatControl.Type.MASTER_GAIN);
        gainControl.setValue(20f * (float) Math.log10(volume));

    }
    /**
     * Metodo getter usado para obtener el valor de volumen dentro del juego
     * @return 
     */
    public float getVolumeGame() {
        FloatControl gainControl = (FloatControl) musicGame.getControl(FloatControl.Type.MASTER_GAIN);
        return (float) Math.pow(10f, gainControl.getValue() / 20f);
    }
    /**
     * Metodo que settea el volumen a gusto dentro del juego
     * @param volume 
     */
    public void setVolumeGame(float volume) {

        if (volume < 0f || volume > 1f) {
            throw new IllegalArgumentException("Volume not valid: " + volume);
        }
        FloatControl gainControl = (FloatControl) musicGame.getControl(FloatControl.Type.MASTER_GAIN);
        gainControl.setValue(20f * (float) Math.log10(volume));

    }
}
