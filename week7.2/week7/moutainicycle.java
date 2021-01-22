package week7;

public class moutainicycle extends bicycle{
    private int gear;

    public int getGear(){
        return gear;
    }
    public void gearBoost(int gear){
        this.gear = gear;
        this.speed = speed + (gear * speedBoost);
    }
}
