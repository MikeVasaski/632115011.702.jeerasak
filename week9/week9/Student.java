package week9;
import java.util.Scanner;

public class Student {
    private String firstname = "Hello";
    private String lastname = "World";

    public Student(String firstname, String lastname){
        this.firstname = firstname;
        this.lastname = lastname;
    }

    public String toString(){
        return "My first name " + firstname + " last name " + lastname;
    }

    public static void main(String[] agrs){
        Student p;
        Scanner input = new Scanner(System.in);

        System.out.print("press enter when finish fillng first name \nthen enter last name after.");
        System.out.println("Please enter your first & last name: ");
        p = new Student(input.nextLine(), input.nextLine());

        System.out.println(p.toString());
    }

}
