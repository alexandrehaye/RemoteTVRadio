public class Commande_TelevisionVolumeUp implements Icommande {
    private Television television;

    public Commande_TelevisionVolumeUp(Television theTelevision) {
        this.television = theTelevision;
    }

    @Override
    public void execute() {

        this.television.volumeUp();
    }

    @Override
    public void undo() {

        this.television.volumeDown();
    }


}
