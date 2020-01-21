import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Window extends JFrame{
    private Telecommande telecommande;
    private JPanel pan = new JPanel();
    private JButton bouton1 = new JButton(new ImageIcon("../image/play.jpg"));

    public Window(Telecommande theTelecommande){
        this.telecommande = theTelecommande;
        this.setTitle("Telecommande Radio/TV");
        this.setSize(1650, 1080);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);

        JPanel pan = new JPanel();
        bouton1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                theTelecommande.pressBtn1();
            }
        });
        pan.add(bouton1);


        this.setContentPane(pan); //on previent jframe que jpanel sera son content pan
        this.setVisible(true);

    }
}
