package week6;

public class J_teacher extends Person{
    public String teacher;

    public J_teacher(String name, int age, String gender){
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public void jobListT(){
        System.out.println(name+" is a teacher."+teacher+"\n");
    }
}
