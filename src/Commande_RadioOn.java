
public class Commande_RadioOn implements Icommande {
    private Radio radio;

    public Commande_RadioOn(Radio theRadio) {

        this.radio = theRadio;
    }

    @Override
    public void execute() {
        if(this.radio.state==false){
            this.radio.on();
        }
    }

    @Override
    public void undo() {

        this.radio.off();
    }
}


