public class Telecommande {
    private Icommande bouton1;
    private Icommande bouton2;
    private Icommande bouton3;
    private Icommande bouton4;
    private Icommande bouton5;
    private Icommande bouton6;

    public Telecommande(Icommande btn1, Icommande btn2, Icommande btn3, Icommande btn4, Icommande btn5, Icommande btn6){
        this.bouton1 = btn1;
        this.bouton2 = btn2;
        this.bouton3 = btn3;
        this.bouton4 = btn4;
        this.bouton5 = btn5;
        this.bouton6 = btn6;
    }

    public Telecommande(Icommande btn1, Icommande btn2){
        this.bouton1 = btn1;
        this.bouton2 = btn2;
    }

    public void pressBtn1(){
        this.bouton1.execute();
    }
    public void pressBtn2(){
        this.bouton2.execute();
    }
    public void pressBtn3(){
        this.bouton3.execute();
    }
    public void pressBtn4(){
        this.bouton4.execute();
    }

    public void pressBtn5(){
        this.bouton5.execute();
    }

    public void pressBtn6(){
        this.bouton6.execute();
    }
}
