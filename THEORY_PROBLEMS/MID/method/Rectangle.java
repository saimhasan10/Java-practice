
// method overloading methods
public class Rectangle {
    void square(int l)
    {
        System.out.println("square: "+ (l*l));
    }
    
    void square(double w)
    {
        System.out.println("square: "+ (w*w));
    }

    void square(int w, int h)
    {
        System.out.println("square: "+ (w*h));
    }
}
