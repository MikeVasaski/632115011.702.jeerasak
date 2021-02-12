package week10;


class  person{
    public void hit(Animal animal){
        System.out.println(animal.roar());
    }
}

public class Human{

    public void hit(Animal animal){
        System.out.println(animal.roar());
    }

    public static void main(String[] args) {
        Animal dog = new Dog();// Question 1
        Human human = new Human();
        System.out.println("the first calling hit(Animal)");
        human.hit(dog);//Question 2

        dog = new Cat();
        System.out.println("The second calling hit(Animal)");
        human.hit(dog);//Question 3

        person person = new person();
        Animal myAnimal = new Fish();

        System.out.println("When the person hit fish.");
        person.hit(myAnimal);
    }
}