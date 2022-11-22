package proyecto;
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

public class Dibujo extends JPanel {
    private int x=117,y=120;
    public int aux_x;
    public int aux_y;
    public Dibujo(){
        this.setBackground(Color.cyan);    
    }
    
    public int gettX(){
        this.aux_x=x;
        return x;
        
    }
    public int gettY(){
        this.aux_y=y;
        return y;
    }
    
    @Override
    public void paint(Graphics g){ //se agrega para pintar rectángulo rojo
       super.paint(g);
       //PAINT CARRETERA.
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
       
       //PAINT AUTO.
       g.setColor(Color.red);      //se unta el pincel g en color rojo
       g.fillRect(x,y,70,30);    //se le dice al pincel pinte rectángulo
       
       
       //Ruedas
       g.setColor(Color.DARK_GRAY); 
       g.fillOval(x+3,y-5,26,10);
       g.setColor(Color.DARK_GRAY);
       g.fillOval(x+3,y+25,26,10);
       g.setColor(Color.DARK_GRAY);
       g.fillOval(x+40,y-5,26,10);
       g.setColor(Color.DARK_GRAY);
       g.fillOval(x+40,y+25,26,10);
       
       //Focos autito.
       g.setColor(Color.yellow);
       g.fillOval(x+63,y+17,10,10);
       g.setColor(Color.yellow);
       g.fillOval(x+63,y+3,10,10);
     
       
    }  
    
    //DIRECCIONES DEL VEHICULO CON TECLAS.
    public void MoverArriba(){
        if(y>=0){
            y = y-10;
        }
    }
    
    public void MoverDerecha(){
        if(x<=730){
            x=x+10;
        }
    }
    
    public void MoverIzquierda(){
        if(x>=30){
            x=x-10;
        }
    }
    
    public void MoverAbajo(){
        if(y<=730){
            y=y+10;
        }
    }
}
