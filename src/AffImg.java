


import java.awt.Color;
import java.awt.Dimension; 
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Label;
import java.awt.MediaTracker;
import java.awt.Panel;
import java.awt.Toolkit;
import java.awt.geom.Rectangle2D;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.JLabel;



public class AffImg extends Panel {
	
	  private static final long serialVersionUID = 1L;
	  private Image image;

	
  
	  public AffImg(String filename) {
	    java.net.URL url = this.getClass().getResource("remotefin.png");
	    image = Toolkit.getDefaultToolkit().getImage(url);
	 
	    try {
	      MediaTracker mt = new MediaTracker(this);
	      mt.addImage(image, 0);
	  
	      mt.waitForAll();
	    } catch (Exception e) {
	      e.printStackTrace();
	    }
	    this.setPreferredSize(new Dimension(image.getWidth(this), image
	        .getHeight(this)));
	   
	  }
	
	  
	  public void paint(Graphics g) {
		 
		Graphics2D g2 = (Graphics2D) g;
	    g.drawImage(image, 0, 0, null);
	    
	    Back back = new Back();
	    back.paint(g);
	 
	  }
	  

}
