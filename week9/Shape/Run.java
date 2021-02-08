package Shape;

public class Run {
    public static void main(String[] args) {
        shape shape,rectangle,cube;
        
        shape = new shape();// deine default shape
        rectangle = new Rectangle(4, 8, "rectangle");
        cube = new Cube(5, 5, 5, "cube");

        System.out.println(shape.toString());
        System.out.println(rectangle.toString());
        System.out.println(cube.toString());

    }
    
}
