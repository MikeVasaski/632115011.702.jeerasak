package week6;

public class J_motorGP extends Person{
    public String mototDK;

    public J_motorGP(String name, int age, String gender){
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public void jobListM(){
        System.out.println(name+" is a Motor GP. He is "+mototDK+"\n");
    }
}
