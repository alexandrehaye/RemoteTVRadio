public class Commande_RadioNextStation implements Icommande{
    private Radio radio;

    public Commande_RadioNextStation(Radio theRadio) {
        this.radio = theRadio;
    }

    @Override
    public void execute() {
        this.radio.StationNext();
    }

    @Override
    public void undo() {
        this.radio.StationPrev();
    }
}
