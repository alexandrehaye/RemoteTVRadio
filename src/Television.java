public class Television {

    private int volume = 0;
    private int channel = 1;
    private int numChannel = 8;
    private int maxVolume = 30;
    public boolean state = false;

    public void on(){
        System.out.println("TV On");
        this.state = true;
    }

    public void off(){
        System.out.println("TV Off");
        this.state = false;
    }

    public void volumeUp(){
        if (this.volume == maxVolume){
            this.volume = maxVolume;
        } else {
            this.volume++;
        }
        System.out.println("Le volume de la TV est de : " + this.volume);
    }

    public void volumeDown(){
        if (this.volume == 0) {
            this.volume = 0;
        } else {
            this.volume--;
        }
        System.out.println("Le volume de la TV est de : " + this.volume);
    }

    public void ChannelNext(){
        if (this.channel == this.numChannel) {
            this.channel = 1;
        } else {
            this.channel++;
        }
        System.out.println("Vous êtes sur la chaîne:" + this.channel);
    }

    public void ChannelPrev(){
        if(this.channel == 1) {
            this.channel = this.numChannel;
        } else {
            this.channel--;
        }
        System.out.println("Vous êtes sur la chaîne:" + this.channel);
    }

    public int getCurrentChannel(){
        return this.channel;
    }

    public int getCurrentVolume(){
        return this.volume;
    }
    
}
