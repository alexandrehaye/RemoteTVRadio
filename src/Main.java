import java.io.Console;

public class Main {
    public static void main(String[] args) {
        //Creation telecommande Radio
        Radio radio = new Radio();
        Telecommande telecommandeRadio = new Telecommande(new Commande_RadioOn(radio), new Commande_RadioOff(radio),
                new Commande_RadioPrevStation(radio), new Commande_RadioNextStation(radio), new Commande_RadioVolumeDown(radio), new Commande_RadioVolumeUp(radio));

        //Création télécommande console
        Television television = new Television();
        Telecommande telecommandeTelevision = new Telecommande(new Commande_TelevisionOn(television), new Commande_TelevisionOff(television),
            new Commande_TelevisionPrevChannel(television), new Commande_TelevisionNextChannel(television), new Commande_TelevisionVolumeDown(television), new Commande_TelevisionVolumeUp(television));

        //Test télecommande radio
        //telecommandeRadio.pressBtn1(); //Radio On
        //telecommandeRadio.pressBtn2(); //Radio Off
        //telecommandeRadio.pressBtn3(); //Radio Previous Station
        //telecommandeRadio.pressBtn4(); //Radio Next Station
        //telecommandeRadio.pressBtn5(); //Radio Volume Down
        //telecommandeRadio.pressBtn6(); //Radio Volume Up

        //telecommandeTelevision.pressBtn1(); //TV On
        //telecommandeTelevision.pressBtn2(); //TV Off
        //telecommandeTelevision.pressBtn3(); //TV Previous Channel
        //telecommandeTelevision.pressBtn4(); //TV Next Channel
        //telecommandeTelevision.pressBtn5(); //TV Volume Down
        //telecommandeTelevision.pressBtn6(); //TV Volume Up

        Telecommande telecommandeMultiple = new Telecommande(new Commande_AllOn(radio, television), new Commande_AllOff(radio, television));

        telecommandeMultiple.pressBtn1(); //TV & Radio ON
        telecommandeMultiple.pressBtn2(); //TV & Radio OFF

        Window window = new Window(telecommandeMultiple);
    }
}
