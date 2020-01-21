public class Commande_TelevisionOn implements Icommande {
    private Television television;

    public Commande_TelevisionOn(Television theTelevision) {

        this.television = theTelevision;
    }

    @Override
    public void execute() {

        this.television.on();
    }

    @Override
    public void undo() {

        this.television.off();
    }
}
