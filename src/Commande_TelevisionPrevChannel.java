public class Commande_TelevisionPrevChannel implements Icommande{
    private Television television;

    public Commande_TelevisionPrevChannel(Television theTelevision) {
        this.television = theTelevision;
    }

    @Override
    public void execute() {
        this.television.ChannelPrev();
    }

    @Override
    public void undo() {
        this.television.ChannelNext();
    }
}
