public class Commande_TelevisionVolumeDown implements Icommande {
    private Television television;

    public Commande_TelevisionVolumeDown(Television theTelevision) {

        this.television = theTelevision;
    }

    @Override
    public void execute() {
        this.television.volumeDown();
    }

    @Override
    public void undo() {
        this.television.volumeUp();
    }
}
