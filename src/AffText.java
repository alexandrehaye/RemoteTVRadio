import java.awt.Dimension; 
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Label;
import java.awt.MediaTracker;
import java.awt.Panel;
import java.awt.Toolkit;
import javax.swing.JLabel;

public class AffText extends Panel {

	//CLASS PAS UTILISE
	
	public AffText() {
		
		 try {
			 Label textVolTV = new Label("Volume");
			    //textVolTV.setBounds(0, 0,0,0);
				  textVolTV.setFont(new Font("Arial", Font.BOLD, 26));
				  this.add(textVolTV);
				  this.setLocation(0,0);
		    } catch (Exception e) {
		      e.printStackTrace();
		    }
		
		 
} 
	



}
