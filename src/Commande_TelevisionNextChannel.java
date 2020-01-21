public class Commande_TelevisionNextChannel implements Icommande{
    private Television television;

    public Commande_TelevisionNextChannel(Television theTelevision) {
        this.television = theTelevision;
    }

    @Override
    public void execute() {
        this.television.ChannelNext();
    }

    @Override
    public void undo() {
        this.television.ChannelPrev();
    }
}
