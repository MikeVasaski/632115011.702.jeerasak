package simple;

public class specific extends Person{
    String gender;
    String singerMood;

    public specific(String name, int bornYear, String gender, String singerMood){
        super(name,bornYear);
        this.gender = gender;
        this.singerMood = singerMood;
    }

    public void introduce(){
        super.introduce();
        System.out.println("Gemder: "+ gender +", "+ name + " is a "+ singerMood + " super star who is very popular in " + (bornYear+25) +".");
        System.out.print("-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-");
    }
}
