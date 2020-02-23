public class Radio {
    private int volume = 0;
    private int station = 1;
    private int maxVolume = 10;
    private int maxStation = 5;
    public boolean state = false;

    public void on(){
        System.out.println("Radio On");
        this.state = true;
    }

    public void off(){
        System.out.println("Radio Off");
        this.state = false;
    }

    public void volumeUp(){
        if(this.volume == maxVolume){
            this.volume = maxVolume;
        } else {
            this.volume++;
        }
        System.out.println("Le volume est de : " + this.volume);
    }

    public void volumeDown(){
        if(this.volume == 0){
            this.volume = 0;
        } else {
            this.volume--;
        }
        System.out.println("Le volume est de : " + this.volume);
    }

    public void StationNext(){
        if(this.station == this.maxStation) {
            this.station = 1;
        } else {
            this.station++;
        }
        System.out.println("Vous êtes sur la station:" + this.station);
    }

    public void StationPrev(){
        if(this.station == 1) {
            this.station = this.maxStation;
        } else {
            this.station--;
        }
        System.out.println("Vous êtes sur la station:" + this.station);
    }

    public int getCurrentStation(){
        return this.station;
    }

    public int getCurrentVolume(){
        return this.volume;
    }
}
