package Shape;

public class Cube extends Rectangle{
    public int length;

        public Cube(int width, int height, int length ,String type){
            super(width, height, type);
            this.length = length;
    }

    public String toString(){
        return "This is a " + type_shape + " with the side of "+ (length * width * height);
    }
}
