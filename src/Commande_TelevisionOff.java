public class Commande_TelevisionOff implements Icommande {
    private Television television;

    public Commande_TelevisionOff(Television theTelevision) {
        this.television = theTelevision;
    }

    @Override
    public void execute() {
        this.television.off();
    }

    @Override
    public void undo() {
        this.television.on();
    }
}
