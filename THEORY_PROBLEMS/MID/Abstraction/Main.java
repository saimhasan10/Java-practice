
public class Main {
    public static void main(String[] args) {
        Shape circle = new Circle(); // Creating an object of Circle
        Shape rectangle = new Rectangle(); // Creating an object of Rectangle

        circle.draw(); // Output: Drawing a Circle
        rectangle.draw(); // Output: Drawing a Rectangle

        circle.description(); // Output: This is a shape.
        rectangle.description(); // Output: This is a shape.
    }
}
