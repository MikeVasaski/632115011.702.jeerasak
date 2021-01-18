package week7;

public class Dog extends Pet{
    
    private String size;
    private String hair_length;

    public Dog(String species, String name, String color, int age){
        this.species = species;
        this.name = name;
        this.color = color;
        this.age = age;
    }

    public void setDog(String size, String hair_length){
        this.size = size;
        this.hair_length = hair_length;
    }

    public void disPlayDog(){
        System.out.println("Hair type: "+hair_length+"\t\tSide: "+size);
    }

    public String Bark(){
        if(size.equals("small"))
            return "It barks Box! Box!";
        else if(size.equals("medium"))
            return "It barks Hong! Hong!";
        else if(size.equals("big"))
            return "It barks Boah! Boah!";
        else
            return "Hm.please check your dog size";
    }

    public void Run(){
        System.out.println(name+" run follows the bicycle.");
    }

    public String isShorthair(){
        if(hair_length.equals("short"))
            return "Short hair: true";
        else
            return "Short hair: false";
    }
    
}
