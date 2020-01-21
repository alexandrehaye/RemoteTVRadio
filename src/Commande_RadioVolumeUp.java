public class Commande_RadioVolumeUp implements Icommande {
    private Radio radio;

    public Commande_RadioVolumeUp(Radio theRadio) {
        this.radio = theRadio;
    }

    @Override
    public void execute() {
        this.radio.volumeUp();
    }

    @Override
    public void undo() {
        this.radio.volumeDown();
    }
}
