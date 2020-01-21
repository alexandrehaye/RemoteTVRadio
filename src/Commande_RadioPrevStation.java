public class Commande_RadioPrevStation implements Icommande{
    private Radio radio;

    public Commande_RadioPrevStation(Radio theRadio) {
        this.radio = theRadio;
    }

    @Override
    public void execute() {
        this.radio.StationPrev();
    }

    @Override
    public void undo() {
        this.radio.StationNext();
    }
}
