package week7;

public class Fish extends Pet{
    private String size;
    private String residence;
    private String swimspeed;

    public Fish(String species, String name, String color, int age){
        this.species = species;
        this.name = name;
        this.color = color;
        this.age = age;
    }

    public void setFish(String size, String residence, String swimspeed){
        this.size = size;
        this.residence = residence;
        this.swimspeed = swimspeed;
    }

    public void displayFish(){
       System.out.print("Source of residence: "+residence+"\nSize: "+size);
       System.out.println("\tSwim speed: "+swimspeed);
    }

    public void totheSea(){
        if(residence.equals("fresh water"))
            System.out.println("It does not live in the sea.");
        else
            System.out.println("It swims into the sea.");
    }

    public String isswimFast(){
        if(swimspeed.equals("fast"))
            return "Swim fast: true";
        else
            return "Swim fast: false";
    }

}
