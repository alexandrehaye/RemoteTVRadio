import java.awt.Label;
//import java.awt.*;
import java.awt.event.*;
//import java.io.Console;
//import javax.swing.*;
import javax.swing.JFrame;

public class Main extends JFrame implements MouseListener {

  private static final long serialVersionUID = 1L;
  Label textVolTV = new Label("TEST");

  public Main(String titre) {
    super(titre);
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  }

  public static void main(String[] args) {
    Main app = new Main("REMOTE");
    Radio radio = new Radio();
    Television television = new Television();
    AffImg afficheImage = new AffImg("remotefin.png",radio,television);
    app.add(afficheImage);
    app.setLocation(0, 0);
    app.pack();
    app.setResizable(false);
    app.setVisible(true);
    

    afficheImage.addMouseListener(new MouseAdapter() {
      public void mouseClicked(MouseEvent e) { 

        // change text of button after click

        if (e.getX() > 468 && e.getY() > 346 && e.getX() < 498 && e.getY() < 376 ) {
          System.out.print("BOUTON Chanel TV +\n");
          new Commande_TelevisionNextChannel(television).execute();
          afficheImage.stopMusic();
          afficheImage.refresh();
        }
        if (e.getX() > 468 && e.getY() > 393 && e.getX() < 498 && e.getY() < 423 ) {
          System.out.print("BOUTON Chanel TV -\n");
          new Commande_TelevisionPrevChannel(television).execute();
          afficheImage.stopMusic();
          afficheImage.refresh();
          
        }
        if (e.getX() > 516 && e.getY() > 346 && e.getX() < 546 && e.getY() < 376 ) {
          System.out.print("BOUTON Vol TV +\n");
          new Commande_TelevisionVolumeUp(television).execute();
          afficheImage.stopMusic();
          afficheImage.refresh();
        
        }
        if (e.getX() > 516 && e.getY() > 393 && e.getX() < 546 && e.getY() < 423 ) {
          System.out.print("BOUTON Vol TV -\n");
          new Commande_TelevisionVolumeDown(television).execute();
          afficheImage.stopMusic();
          afficheImage.refresh();
        }
        if (e.getX() > 657 && e.getY() > 346 && e.getX() < 687 && e.getY() < 376 ) {
          System.out.print("BOUTON Chanel Radio +\n");
          new Commande_RadioNextStation(radio).execute();
          afficheImage.stopMusic();
          afficheImage.refresh();
        }
        if (e.getX() > 657 && e.getY() > 393 && e.getX() < 687 && e.getY() < 423 ) {
          System.out.print("BOUTON Chanel Radio -\n");
          new Commande_RadioPrevStation(radio).execute();
          afficheImage.stopMusic();
          afficheImage.refresh();
        }
        if (e.getX() > 705 && e.getY() > 346 && e.getX() < 735 && e.getY() < 376 ) {
          System.out.print("BOUTON Vol Radio +\n");
          new Commande_RadioVolumeUp(radio).execute();
          afficheImage.stopMusic();
          afficheImage.refresh();
        }
        if (e.getX() > 705 && e.getY() > 393 && e.getX() < 735 && e.getY() < 423 ) {
          System.out.print("BOUTON Vol Radio -\n");
          new Commande_RadioVolumeDown(radio).execute();
          afficheImage.stopMusic();
          afficheImage.refresh();
    
        }
        if (e.getX() > 588 && e.getY() > 319 && e.getX() < 608 && e.getY() < 349 ) {
          System.out.print("BOUTON ALL ON\n");
          new Commande_AllOn(radio, television).execute();
          afficheImage.stopMusic();
          afficheImage.refresh();
        }
        if (e.getX() > 588 && e.getY() > 364 && e.getX() < 608 && e.getY() < 394 ) {
          System.out.print("BOUTON ALL OFF\n");
          new Commande_AllOff(radio, television).execute();
          afficheImage.stopMusic();
          afficheImage.refresh();
          
        }
        if (e.getX() > 588 && e.getY() > 413 && e.getX() < 608 && e.getY() < 443 ) {
          System.out.print("BOUTON Undo \n");
          afficheImage.refresh();
          
        }
        if (e.getX() > 447 && e.getY() > 300 && e.getX() < 477 && e.getY() < 330 ) {
          System.out.print("BOUTON TVONOFF\n");
          if(television.state==false){
            new Commande_TelevisionOn(television).execute();
            afficheImage.stopMusic();
            afficheImage.refresh();
          }else{
            new Commande_TelevisionOff(television).execute();
            afficheImage.stopMusic();
            afficheImage.refresh();
          }
        }
        if (e.getX() > 734 && e.getY() > 300 && e.getX() < 764 && e.getY() < 330 ) {
          System.out.print("BOUTON RADIOONOFF\n");
          if(radio.state==false){
            new Commande_RadioOn(radio).execute();
            afficheImage.stopMusic();
            afficheImage.refresh();
          }else{
            new Commande_RadioOff(radio).execute();
            afficheImage.stopMusic();
            afficheImage.refresh();
          }
        }
    }} );
  }

  @Override
  public void mouseClicked(MouseEvent e) {
    // TODO Auto-generated method stub

  }

  @Override
  public void mousePressed(MouseEvent e) {
    // TODO Auto-generated method stub

  }

  @Override
  public void mouseReleased(MouseEvent e) {
    // TODO Auto-generated method stub

  }

  @Override
  public void mouseEntered(MouseEvent e) {
    // TODO Auto-generated method stub

  }

  @Override
  public void mouseExited(MouseEvent e) {
    // TODO Auto-generated method stub

  }
}
