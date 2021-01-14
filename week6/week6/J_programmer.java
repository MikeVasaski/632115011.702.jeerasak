package week6;

public class J_programmer extends Person{
    public String place_job;

    public J_programmer(String name, int age, String gender){
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public void jobListP(){
        System.out.println(name + " is the programmer.\nHis job is "+place_job+"\n");
    }
}
