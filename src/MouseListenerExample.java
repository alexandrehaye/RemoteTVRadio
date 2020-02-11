import java.awt.*;  
import java.awt.event.*;
import java.io.Console; 

public class MouseListenerExample extends Frame implements MouseListener{  
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    MouseListenerExample(){  
        addMouseListener(this);    
    }  


    public void mouseClicked(MouseEvent e) {  
        if(e.getX()>150 && e.getY()<150){
            System.out.print("Haut Droit");
        }
        if(e.getX()>150 && e.getY()>150){
            System.out.print("Haut Droit");
        }
        if(e.getX()<150 && e.getY()<150){
            System.out.print("Haut Droit"); 
        }
        if(e.getX()<150 && e.getY()>150){
            System.out.print("Haut Droit");
        }
         
    }  
    public void mouseEntered(MouseEvent e) {  
        System.out.print("Haut Droit");
    }  
    public void mouseExited(MouseEvent e) {  
        System.out.print("Haut Droit");  
    }  
    public void mousePressed(MouseEvent e) {  
        System.out.print("Haut Droit"); 
    }  
    public void mouseReleased(MouseEvent e) {  
        System.out.print("Haut Droit");  
    }  
}  