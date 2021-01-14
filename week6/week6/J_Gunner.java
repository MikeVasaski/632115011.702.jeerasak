package week6;

public class J_Gunner extends Person{
    public String gun;

    public J_Gunner(String name, int age, String gender){
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public void jobListG(){
        System.out.println(name+" is a Gunner. He do "+gun+" every time\n");
    }
}
