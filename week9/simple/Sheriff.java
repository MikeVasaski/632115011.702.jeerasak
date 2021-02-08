package simple;

public class Sheriff extends Person {
     String workState;

    public Sheriff(String name, int bornYear, String workState){
        super(name, bornYear);
        this.workState = workState;
    }

    //overriding method
    public void introduce(){
        super.introduce();
        System.out.println("I'm a sheriff and work in "+ this.workState +".");
    }
}
