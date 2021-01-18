package week7;

public class Bird extends Pet{
    private String country;
    private String fly;

    public Bird(String species, String name, String color, int age){
        this.species = species;
        this.name = name;
        this.color = color;
        this.age = age;
    }

    public void disPlayBird(){
        System.out.println("Country: "+country+"\tFlying: "+fly);
    }

    public void setBird(String country, String fly){
        this.country = country;
        this.fly = fly;
    }

    public void Speak(){
        if(species.equals("Parrots") || species.equals("Songbirds"))
            System.out.println("Speak: Yes, it can mimic the human's speech.");
        else
            System.out.println("Speak; No, this species can not speak.");
    }

    public void checkCountry(){
        System.out.println("This Bird come from "+country);
    }

    public String isCanfly(){
        if(species.equals("Bigbirds"))
            return "false";
        else
            return "true";
        }
}
