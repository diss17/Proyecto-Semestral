package proyecto;
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

public class Dibujo extends JPanel {
    public Dibujo(){
        this.setBackground(Color.cyan);    
    }
    
    @Override
    public void paint(Graphics g){ //se agrega para pintar rectángulo rojo
       super.paint(g);
       //Auto
       g.setColor(Color.red);      //se unta el pincel g en color rojo
       g.fillRect(117,120,70,30);    //se le dice al pincel pinte rectángulo
       
       
       //Ruedas
       g.setColor(Color.DARK_GRAY); 
       g.fillOval(120,115,26,10);
       g.setColor(Color.DARK_GRAY);
       g.fillOval(120,145,26,10);
       g.setColor(Color.DARK_GRAY);
       g.fillOval(157,115,26,10);
       g.setColor(Color.DARK_GRAY);
       g.fillOval(157,145,26,10);
       
       //Focos autito.
       g.setColor(Color.yellow);
       g.fillOval(180,137,10,10);
       g.setColor(Color.yellow);
       g.fillOval(180,123,10,10);
       
       //Carretera idk-RECTOS
       g.setColor(Color.LIGHT_GRAY);
       g.fillRect(200,100,330,80);
       
       g.setColor(Color.LIGHT_GRAY);
       g.fillRect(200,250,330, 80);
       
       g.setColor(Color.LIGHT_GRAY);
       g.fillRect(200,400, 300, 80);
       
       g.setColor(Color.LIGHT_GRAY);
       g.fillRect(200,550, 300, 80);
       
       //Linea de Meta
       g.setColor(Color.white);
       g.fillRect(180,550, 30, 80);
       //Linea Salida
       g.setColor(Color.black);
       g.fillRect(200,100, 30, 80);
       
       //Carretera idk-CURVAS
       //g.setColor(Color.LIGHT_GRAY);
       //g.fillArc(410,179,200,142,0,90); //(x,y,tamaño ancho,largo,arco de inicio en grd, arco final en grd, tipo de arco)
       
       g.setColor(Color.LIGHT_GRAY);
       g.fillArc(440, 100, 180 , 230, -90,180);
       
       g.setColor(Color.LIGHT_GRAY);
       g.fillArc(110, 250, 180, 230, 90,180);
       
       g.setColor(Color.LIGHT_GRAY);
       g.fillArc(410, 400, 180, 230, -90,180);
     
       
    }  
}
