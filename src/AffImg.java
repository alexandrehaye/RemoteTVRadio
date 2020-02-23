


import java.awt.Color;
import java.awt.Dimension; 
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Label;
import java.awt.MediaTracker;
import javax.swing.JPanel;
import java.awt.Toolkit;
import java.io.File;
import java.io.IOException;
import javax.sound.sampled.FloatControl;
import java.lang.Math;

import javax.imageio.ImageIO;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;



public class AffImg extends JPanel {
	
	  private static final long serialVersionUID = 1L;
	  private Image image;
	  private Image ImgFile;

	  private Radio radio;
	  private Television television;
	  
	  

	  
	  
	  File brazers = new File("src/img/brazers.jpg");
	  File chasseetpeche = new File("src/img/chasseetpeche.jpg");
	  File cmonchoix = new File("src/img/cmonchoix.jpg");
	  File curling = new File("src/img/curling.jpg");
	  File moins18 = new File("src/img/moins18.png");
	  File next = new File("src/img/NEXT.jpg");
	  File petanque = new File("src/img/petanque.jpg");
	  File pimp = new File("src/img/pimp.jpg");
	  File noir = new File("src/img/noir.jpg");
	  
	  File koba = new File("src/music/koba.wav");
	  File jul = new File("src/music/jul.wav");
	  File bim = new File("src/music/bimbamboum.wav");
	  File salut = new File("src/music/salut.wav");
	  File tono = new File("src/music/tono.wav");
	  Clip clip=null;
	Clip clip1;
	Clip clip2;
	Clip clip3;
	Clip clip4;
	Clip clip5;
	
	
	  
  
	  public AffImg(String filename, Radio radio, Television television) {
		this.radio = radio;
        this.television = television;
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

	  public void setVolume() {
		if (clip1!=null) {
			clip=clip1;
		  }
		  if (clip2.isActive()) {
			clip=clip2;
		  }
		  if (clip3.isActive()) {
			clip=clip3;
		  }
		  if (clip4.isActive()) {
			clip=clip4;
		  }
		  if (clip5.isActive()) {
			clip=clip5;
		  }
		  if(clip!=null){
		  float sound = (radio.getCurrentVolume());
		  FloatControl volumeControl = (FloatControl) clip.getControl(FloatControl.Type.MASTER_GAIN);
			volumeControl.setValue(20f * (float) Math.log10(sound));
			}
		}

	  public void loadClip(){
		try {
			clip1 = AudioSystem.getClip();
			clip1.open(AudioSystem.getAudioInputStream(salut));
			clip2 = AudioSystem.getClip();
			clip2.open(AudioSystem.getAudioInputStream(jul));
			clip3 = AudioSystem.getClip();
			clip3.open(AudioSystem.getAudioInputStream(koba));
			clip4 = AudioSystem.getClip();
			clip4.open(AudioSystem.getAudioInputStream(bim));
			clip5 = AudioSystem.getClip();
			clip5.open(AudioSystem.getAudioInputStream(tono));
		}
		catch(Exception ex) {
			System.out.println("Error, Radio chanel unavailable");
		} 
	  }
	  

	  public void refresh(){
		  repaint();
	  }

	  public void stopMusic(){
		  clip1.stop();
		  clip2.stop();
		  clip3.stop();
		  clip4.stop();
		  clip5.stop();
	  }

	  public void tvChannel(Graphics g, File file){
		  try {
			ImgFile = ImageIO.read(file);		
			}
		catch(IOException ex) {
			System.out.println("Error, TV chanel unavailable");
		}
			g.drawImage(ImgFile, 101, 42, 232, 131, null, null);
	  }
	  
	  public void cleaningTxt(Graphics2D g2){
		Font NumChannel = new Font("Arial",Font.BOLD,24);
		g2.setFont(NumChannel);
		g2.setColor(Color.WHITE);
		Font NumVolume = new Font("Arial",Font.BOLD,24);
		g2.setFont(NumVolume);
		g2.setColor(Color.WHITE);
		Font NumChannelRadio = new Font("Arial",Font.BOLD,24);
		g2.setFont(NumChannelRadio);
		g2.setColor(Color.WHITE);		
		Font NumVolumeRadio = new Font("Arial",Font.BOLD,24);
		g2.setFont(NumVolumeRadio);
		g2.setColor(Color.WHITE);
		
		for(int i=0;i<8;i++){
			g2.drawString(String.valueOf(i), 240, 260);
			g2.drawString(String.valueOf(i), 240, 300);
			g2.drawString(String.valueOf(i), 970, 260);
			g2.drawString(String.valueOf(i), 970, 300);
		}
		
	  }
	  
	  public void paint(Graphics g) {
		 
		Graphics2D g2 = (Graphics2D) g;
	    g.drawImage(image, 0, 0, null);
		
		
		cleaningTxt(g2);
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
		int cha = television.getCurrentChannel();
		g2.drawString(String.valueOf(cha), 240, 260);
		
		Font NumVolume = new Font("Arial",Font.BOLD,24);
		g2.setFont(NumVolume);
		g2.setColor(Color.BLACK);
		int vol = television.getCurrentVolume();
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
		int chaR = radio.getCurrentStation();
		g2.drawString(String.valueOf(chaR), 970, 260);
		
		Font NumVolumeRadio = new Font("Arial",Font.BOLD,24);
		g2.setFont(NumVolumeRadio);
		g2.setColor(Color.BLACK);
		int volR = radio.getCurrentVolume();
		g2.drawString(String.valueOf(volR), 970, 300);
		
		//
		//TEST POUR CHAQUE IMAGE
		//  
		if(television.state==true){
		if(television.getCurrentChannel()==1){
			tvChannel(g,cmonchoix);
		}

		if(television.getCurrentChannel()==2){
			tvChannel(g,curling);
		}

		if(television.getCurrentChannel()==3){
			tvChannel(g,moins18);
		}

		if(television.getCurrentChannel()==4){
			tvChannel(g,petanque);
		}

		if(television.getCurrentChannel()==5){
			tvChannel(g,pimp);
		}

		if(television.getCurrentChannel()==6){
			tvChannel(g,next);
		}

		if(television.getCurrentChannel()==7){
			tvChannel(g,chasseetpeche);
		}

		if(television.getCurrentChannel()==8){
			tvChannel(g,brazers);
		}
		}else{
			tvChannel(g, noir);
		}

		
		loadClip();
		setVolume();

			if(radio.state==true){
		
		if (radio.getCurrentStation()== 1) {
			
			clip1.start();
		}

		if (radio.getCurrentStation()== 2) {
			
			
			clip2.start();
		}

		if (radio.getCurrentStation()== 3) {

			
			clip3.start();
		}

		if (radio.getCurrentStation()== 4) {
	
			
			clip4.start();
		}

		if (radio.getCurrentStation()== 5) {
	
			clip5.start();
		}		
	  }else{
		  stopMusic();
	  }
	
		
	  }
	  

}
