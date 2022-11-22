package proyecto;
import javax.swing.JPanel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class PanelPrincipal extends JPanel implements ActionListener,KeyListener{
    public PanelPrincipal(){
        this.addKeyListener(this);
        this.setFocusable(true);
        
        

    }
    public void frenos(){

    }
    public void derecha(){

    }
    public void izquieda(){

    }
    public void pasa_cambios(){

    }
    public void paint(){

    }
    @Override
    public void keyTyped(KeyEvent e) {
        // TODO Auto-generated method stub
        
    }
    @Override
    public void keyPressed(KeyEvent e) {
        // TODO Auto-generated method stub
        switch(e.getKeyCode()){
            case 37 -> System.out.println("xd");
                
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
