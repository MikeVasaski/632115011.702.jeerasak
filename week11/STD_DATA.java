package week11;

public class STD_DATA {
    private String name;
    private int age;
    private double GPA;

    public STD_DATA(String name, int age, double GPA){
        this.name = name;
        this.age = age;
        this.GPA = GPA;
    }

    public String giveName(){
        return this.name;
    }

    public int giveAge(){
        return this.age;
    }

    public double giveGPA(){
        return this.GPA;
    }

    public boolean equals(Object obj){
        if (obj == null)
            return false;
        if (obj == this)
            return true;

        //return this.giveName() == ((STD_DATA) obj).giveName();
        //return this.giveAge() == ((STD_DATA) obj).giveAge();
        return this.giveGPA() == ((STD_DATA) obj).giveGPA();
    }

}