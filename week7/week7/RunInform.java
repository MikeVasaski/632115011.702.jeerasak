package week7;

public class RunInform {

    public static void main(String[] args) {
        //Dog Information
        Dog myDog = new Dog("American Pugabull","Alistor","Brown",5);   //store dog information.
        myDog.setDog("big","short");    //store dog's size and hair types.
            System.out.println("\n::: My dog :::");
        myDog.disPlayPet();     //show the basic informations of pets.
        myDog.disPlayDog();     //show Dog size and hair types.
        myDog.Run();            //show dog's actions.
            System.out.println(myDog.Bark());   //type bark.
            System.out.println(myDog.isShorthair());    //check hair types.

        //Fish Information
        Fish myfish = new Fish("Bonefish", "Suwan", "Silver-Black", 3); //store fish information.
        myfish.setFish("small", "salt water", "fast");  //store fish's size and residence source.
            System.out.println("\n::: My fish :::");
        myfish.disPlayPet();    //show the basic informations of pets.
        myfish.displayFish();
        myfish.totheSea();
            System.out.println(myfish.isswimFast());

        //Bird Information
        Bird mybird = new Bird("Parrots", "Adword", "bule-yellow", 8);  //store bird information.
        mybird.setBird("Europe", "regular flying"); //store bird country & flying.
            System.out.println("\n::: My bird :::");
        mybird.disPlayPet();    //show the basic informations of pets.
        mybird.disPlayBird();   //show the country and the flying of bird.
        mybird.Speak();         //check & show the speaking of bird.
        mybird.checkCountry();  //reference Bird's country.
            System.out.println("Can fly: "+mybird.isCanfly()); //check bird flying.

        System.out.println();
    }
    
}
