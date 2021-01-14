package week6;

public class J_business extends Person{
    public String busin;

    public J_business(String name, int age, String gender){
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public void jobListB(){
        System.out.println(name+" is a Business. "+busin+" every time\n");
    }
}
