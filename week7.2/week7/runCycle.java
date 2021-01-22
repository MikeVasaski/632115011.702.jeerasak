package week7;

public class runCycle {
    public static void main(String[] args) {
        NormalBicycle();
        MountainBicycle();
    }

    public static void NormalBicycle(){
        bicycle myByte = new bicycle();
            System.out.print("::: Normal Bicycle :::\n");

        myByte.ResetSpeed();
        System.out.println("Bicycle's speed was set");
        System.out.println("The current speed is "+myByte.getSpeed()+" km/hr.");

        System.out.println("Increased speed 5 km/hr:");
        myByte.SpeedUp();
        System.out.println("The current speed is "+myByte.getSpeed()+" km/hr.");
        System.out.println("the road is clearly, applied speed 60 km/hr\n >>>> Boost! >>>>");
        
        for(int i=1;i<=12;i++)
            myByte.SpeedUp();
        
        System.out.println("The current speed is "+myByte.getSpeed()+" km/hr.");
        System.out.println("Breaks bicycle");
        myByte.Break();
        System.out.println("The current speed is "+myByte.getSpeed()+" km/hr.");

        System.out.println();
    }

    public static void MountainBicycle(){
        moutainicycle myMB = new moutainicycle();
            System.out.print("::: Mountain Bicycle :::\n");

        myMB.ResetSpeed();
        System.out.println("This Mountain bicycle has speed "+myMB.getSpeed()+" km/hr.");
        System.out.println("Set gear 3 to up the speed of bicycle");
        myMB.gearBoost(3);

        System.out.println(">>>Speed Boost! Gear Boost!>>>\nNow the speed is "+myMB.getSpeed());
        System.out.println("Now you ride bicycle on gear "+myMB.getGear());
        System.out.println("Boost Maximum Gear!");

        myMB.gearBoost(6);
        System.out.println("Maximum Gear: "+myMB.getGear()+"\n The current speed is "+myMB.getSpeed());
        System.out.println(".\n.\n.. I need to reduce speed to 25 km/hr from "+myMB.getSpeed()+" km/hr");

            while(myMB.getSpeed() != 25){
                myMB.Break();
                System.out.println("Reducing speed...5 km/hr.");
            }
        System.out.println("Hel yeahhh! Now the speed is "+myMB.getSpeed());


        System.out.println();
    }
    
}
