public class Commande_AllOn implements Icommande {
    private Radio radio;
    private Television television;

    public Commande_AllOn(Radio theRadio, Television theTelevision){
        this.radio = theRadio;
        this.television = theTelevision;
    }

    @Override
    public void execute() {
        this.radio.on();
        this.television.on();
    }

    public  void undo() {
        this.radio.off();
        this.television.off();
    }
}
