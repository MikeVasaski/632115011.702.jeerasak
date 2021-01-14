package week6;

public class Person{
    public String name;
    public int age;
    public String gender;

    public Person(){

    }

    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }

    

    public void introduce(){
        System.out.println("My name is "+name+". I'm "+ age+" years old.\nI'm "+gender);
    }

}
