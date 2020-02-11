import java.awt.Label;
import java.awt.*;
import java.awt.event.*;
import java.io.Console;

import javax.swing.JFrame;

public class Main extends JFrame implements MouseListener {

  private static final long serialVersionUID = 1L;
  Label textVolTV = new Label("TEST");

  public Main(String titre) {
    super(titre);
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    init();
  }

  private void init() {
    AffImg afficheImage = new AffImg("remotefin.png");

    this.add(afficheImage);
    this.setLocation(0, 0);
    this.pack();
    this.setResizable(false);
    afficheImage.addMouseListener(this);
  }

  public void mouseEntered(MouseEvent e) {
  }

  public void mouseExited(MouseEvent e) {
  }

  public void mousePressed(MouseEvent e) {
  }

  public void mouseReleased(MouseEvent e) {
  }

  public void mouseClicked(MouseEvent e) {
    ///DEBUTS DES CONDITIONS
    if (e.getX() > 468 && e.getY() > 346 && e.getX() < 498 && e.getY() < 376 ) {
      System.out.print("BOUTON Chanel TV +\n");
    }
    if (e.getX() > 468 && e.getY() > 393 && e.getX() < 498 && e.getY() < 423 ) {
      System.out.print("BOUTON Chanel TV -\n");
    }
    if (e.getX() > 516 && e.getY() > 346 && e.getX() < 546 && e.getY() < 376 ) {
      System.out.print("BOUTON Vol TV +\n");
    }
    if (e.getX() > 516 && e.getY() > 393 && e.getX() < 546 && e.getY() < 423 ) {
      System.out.print("BOUTON Vol TV -\n");
    }
    if (e.getX() > 657 && e.getY() > 346 && e.getX() < 687 && e.getY() < 376 ) {
      System.out.print("BOUTON Chanel Radio +\n");
    }
    if (e.getX() > 657 && e.getY() > 393 && e.getX() < 687 && e.getY() < 423 ) {
      System.out.print("BOUTON Chanel Radio -\n");
    }
    if (e.getX() > 705 && e.getY() > 346 && e.getX() < 735 && e.getY() < 376 ) {
      System.out.print("BOUTON Vol Radio +\n");
    }
    if (e.getX() > 705 && e.getY() > 393 && e.getX() < 735 && e.getY() < 423 ) {
      System.out.print("BOUTON Vol Radio -\n");
    }
    if (e.getX() > 588 && e.getY() > 319 && e.getX() < 608 && e.getY() < 349 ) {
      System.out.print("BOUTON ALL ON\n");
    }
    if (e.getX() > 588 && e.getY() > 364 && e.getX() < 608 && e.getY() < 394 ) {
      System.out.print("BOUTON ALL OFF\n");
    }
    if (e.getX() > 588 && e.getY() > 413 && e.getX() < 608 && e.getY() < 443 ) {
      System.out.print("BOUTON Undo \n");
    }
    if (e.getX() > 447 && e.getY() > 300 && e.getX() < 477 && e.getY() < 330 ) {
      System.out.print("BOUTON TVONOFF\n");
    }
    if (e.getX() > 734 && e.getY() > 300 && e.getX() < 764 && e.getY() < 330 ) {
      System.out.print("BOUTON RADIOONOFF\n");
    }
  }

  public static void main(String[] args) {
    Main app = new Main("REMOTE");
    app.setVisible(true);
    Radio radio = new Radio();
    Telecommande telecommandeRadio = new Telecommande(new Commande_RadioOn(radio), new Commande_RadioOff(radio),
        new Commande_RadioPrevStation(radio), new Commande_RadioNextStation(radio), new Commande_RadioVolumeDown(radio),
        new Commande_RadioVolumeUp(radio));

    // Création télécommande console
    Television television = new Television();
    Telecommande telecommandeTelevision = new Telecommande(new Commande_TelevisionOn(television),
        new Commande_TelevisionOff(television), new Commande_TelevisionPrevChannel(television),
        new Commande_TelevisionNextChannel(television), new Commande_TelevisionVolumeDown(television),
        new Commande_TelevisionVolumeUp(television));

    // Test télecommande radiok
    // telecommandeRadio.pressBtn1(); //Radio On
    // telecommandeRadio.pressBtn2(); //Radio Off
    // telecommandeRadio.pressBtn3(); //Radio Previous Station
    // telecommandeRadio.pressBtn4(); //Radio Next Station
    // telecommandeRadio.pressBtn5(); //Radio Volume Down
    // telecommandeRadio.pressBtn6(); //Radio Volume Up

    // telecommandeTelevision.pressBtn1(); //TV On
    // telecommandeTelevision.pressBtn2(); //TV Off
    // telecommandeTelevision.pressBtn3(); //TV Previous Channel
    // telecommandeTelevision.pressBtn4(); //TV Next Channel
    // telecommandeTelevision.pressBtn5(); //TV Volume Down
    // telecommandeTelevision.pressBtn6(); //TV Volume Up

    Telecommande telecommandeMultiple = new Telecommande(new Commande_AllOn(radio, television),
        new Commande_AllOff(radio, television));

    telecommandeMultiple.pressBtn1(); // TV & Radio ON
    telecommandeMultiple.pressBtn2(); // TV & Radio OFF

    // Window window = new Window(telecommandeMultiple);
  }
}
