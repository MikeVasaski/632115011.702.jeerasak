package Shape;

public class shape {
    public String type_shape = "shape";

    public shape(){

    }
    
    public shape(String type){
        this.type_shape = type;
    }

    public String toString(){
        return "This is a "+type_shape;
    }

}
