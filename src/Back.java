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


public class Back {
	
	//CLASS PAS UTILISE POUR LE MOMENT
	
	private Image image;
	  //private Image bouton;
	  private Image Imgchanel;
	  
	
	public void paint(Graphics g) {
		
		
		java.net.URL url = this.getClass().getResource("remotefin.png");
	    image = Toolkit.getDefaultToolkit().getImage(url);
		 
		  Graphics2D g2 = (Graphics2D) g;
	    g.drawImage(image, 0, 0, null);
	    
	    Font ChannelTV = new Font("Arial",Font.BOLD,24);
		g2.setFont(ChannelTV);
		g2.setColor(Color.BLACK);
		g2.drawString("Channel :", 120, 260);
		
		Font VolumeTV = new Font("Arial",Font.BOLD,24);
		g2.setFont(VolumeTV);
		g2.setColor(Color.BLACK);
		g2.drawString("Volume :", 120, 300);
	   
		Font NumChannel = new Font("Arial",Font.BOLD,24);
		g2.setFont(NumChannel);
		g2.setColor(Color.BLACK);
		int cha = 1;
		g2.drawString(String.valueOf(cha), 240, 260);
		
		Font NumVolume = new Font("Arial",Font.BOLD,24);
		g2.setFont(NumVolume);
		g2.setColor(Color.BLACK);
		int vol = 1;
		g2.drawString(String.valueOf(vol), 240, 300);
	   
		Font ChannelRadio = new Font("Arial",Font.BOLD,24);
		g2.setFont(ChannelRadio);
		g2.setColor(Color.BLACK);
		g2.drawString("Channel :", 850, 260);
		
		Font VolumeRadio = new Font("Arial",Font.BOLD,24);
		g2.setFont(VolumeRadio);
		g2.setColor(Color.BLACK);
		g2.drawString("Volume :", 850, 300);
	   
		Font NumChannelRadio = new Font("Arial",Font.BOLD,24);
		g2.setFont(NumChannelRadio);
		g2.setColor(Color.BLACK);
		int chaR = 1;
		g2.drawString(String.valueOf(chaR), 970, 260);
		
		Font NumVolumeRadio = new Font("Arial",Font.BOLD,24);
		g2.setFont(NumVolumeRadio);
		g2.setColor(Color.BLACK);
		int volR = 1;
		g2.drawString(String.valueOf(volR), 970, 300);
		
		//BOUTON Chanel TV +
		Rectangle2D ChanelTVplus = new Rectangle2D.Double(468,346,30,30);
		g2.setColor(Color.BLUE);
		g2.draw(ChanelTVplus);
		
		//BOUTON Chanel TV -
		Rectangle2D ChanelTVmoins = new Rectangle2D.Double(468,393,30,30);
		g2.setColor(Color.BLUE);
		g2.draw(ChanelTVmoins);

		//BOUTON Vol TV +
		Rectangle2D VolTVplus = new Rectangle2D.Double(516,346,30,30);
		g2.setColor(Color.BLUE);
		g2.draw(VolTVplus);
		
		//BOUTON Vol TV -
		Rectangle2D VolTVmoins = new Rectangle2D.Double(516,393,30,30);
		g2.setColor(Color.BLUE);
		g2.draw(VolTVmoins);	
		
		//BOUTON Chanel Radio +
		Rectangle2D ChanelRadioplus = new Rectangle2D.Double(657,346,30,30);
		g2.setColor(Color.BLUE);
		g2.draw(ChanelRadioplus);
		
		//BOUTON Chanel Radio -
		Rectangle2D ChanelRadiomoins = new Rectangle2D.Double(657,393,30,30);
		g2.setColor(Color.BLUE);
		g2.draw(ChanelRadiomoins);

		//BOUTON Vol Radio +
		Rectangle2D VolRadioplus = new Rectangle2D.Double(705,346,30,30);
		g2.setColor(Color.BLUE);
		g2.draw(VolRadioplus);
		
		//BOUTON Vol Radio -
		Rectangle2D VolRadiomoins = new Rectangle2D.Double(705,393,30,30);
		g2.setColor(Color.BLUE);
		g2.draw(VolRadiomoins);		
		
		//BOUTON All ON
		Rectangle2D Allon = new Rectangle2D.Double(588,319,30,30);
		g2.setColor(Color.BLUE);
		g2.draw(Allon);	
		
		//BOUTON All OFF
		Rectangle2D Alloff = new Rectangle2D.Double(588,364,30,30);
		g2.setColor(Color.BLUE);
		g2.draw(Alloff);	
	  
		//BOUTON Undo
		Rectangle2D Undo = new Rectangle2D.Double(588,413,30,30);
		g2.setColor(Color.BLUE);
		g2.draw(Undo);
		
		//BOUTON TVONOFF
		Rectangle2D Tvonoff = new Rectangle2D.Double(447,300,30,30);
		g2.setColor(Color.BLUE);
		g2.draw(Tvonoff);
		
		//BOUTON RADIOONOFF
		Rectangle2D Radioonoff = new Rectangle2D.Double(734,300,30,30);
		g2.setColor(Color.BLUE);
		g2.draw(Radioonoff);
		
		//java.net.URL url = this.getClass().getResource("C8.png");
	    //Imgchanel = Toolkit.getDefaultToolkit().getImage(url);
		File ch5Img = new File("src/test/C8.png");
		try {
	    	Imgchanel = ImageIO.read(ch5Img);		
		}
		catch(IOException ex) {
			System.out.println("Image Not Found");
		}
	
		
		g.drawImage(Imgchanel,101,42,232,131,null,null);
		int rad = 1;
		File Chanel1 = new File("src/test/0999.wav");
		File Chanel2 = new File("src/test/0579.wav");
		try {
		Clip clip1 = AudioSystem.getClip();
		clip1.open(AudioSystem.getAudioInputStream(Chanel1));
		Clip clip2 = AudioSystem.getClip();
		clip2.open(AudioSystem.getAudioInputStream(Chanel2));
		
		
		if (rad == 1) {
			clip1.start();
		} else
		if (rad == 2) {
		clip1.stop();
		Thread.sleep(3000);
		clip2.start();
		
	  }
		}
		catch(Exception ex) {
			System.out.println("Error in getting total channel of the radio");
		} 
		
	  }
	  
	
}
