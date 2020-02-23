
public class Commande_AllOff implements Icommande {
    private Radio radio;
    private Television television;

    public Commande_AllOff(Radio theRadio, Television theTelevision){
        this.radio = theRadio;
        this.television = theTelevision;
    }

    @Override
    public void execute() {
        if(this.radio.state==true){
            this.radio.off();
        }
        if(this.television.state==true){
        this.television.off();
        }
    }

    public  void undo() {
        this.radio.on();
        this.television.on();
    }
}

