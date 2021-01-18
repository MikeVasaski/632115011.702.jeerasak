package week7;

public class Pet{

    public String species;
    public String name;
    public String color;
    public int age;

    public Pet(){

    }
    
    public Pet(String species, String name, String color, int age){
        this.species = species;
        this.name = name;
        this.color = color;
        this.age = age;
    }

    public void disPlayPet(){
        System.out.println("Name: "+name+"\nSpecies: "+species+"\tAge: "+age+"\tColor: "+color);
    }

}

