package week6;

public class Artist extends Person{
    public String genre;

    public Artist(String name, int age, String gender){
        this.age = age;
        this.name = name;
        this.gender = gender;
    }

   /* public void setGender(String gender){
        this.gender = gender;
    }*/

    public void playMusic(){
        System.out.print(name+" is playing "+genre+" music.");
    }
}
