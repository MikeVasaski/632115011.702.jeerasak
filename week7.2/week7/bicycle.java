package week7;

public class bicycle{
    public int speed = 10;
    public final int speedBoost =5;

    public void ResetSpeed(){
        speed = 10;
    }

    public int getSpeed(){
        return speed;
    }

    public void SpeedUp(){

        if(speed < 100)
            this.speed += speedBoost ;
        else
            speed = 99;
 
    }

    public void Break(){
        if(speed>0)
            this.speed -= speedBoost ;
        else
            speed = 0;

    }
}