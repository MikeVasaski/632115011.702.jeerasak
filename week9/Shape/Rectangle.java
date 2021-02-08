package Shape;

public class Rectangle extends shape {
    public int width;
    public int height;

    public Rectangle(int width, int height,String type){
        super(type);
        this.width = width;
        this.height = height;
    }

    public String toString(){
       return super.toString() + " with width as " + width
                + " and height as " + height;
    }
}
