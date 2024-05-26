// simple method 

public class ArithmaticTest {
    public static void main(String[] args) {
        Arithmatic a = new Arithmatic();
        int add = a.sum(20, 10);
        int sub = a.subtract(30, 20);
        System.out.println("summation: "+ add);
        System.out.println("subtract: "+ sub);

        a.divide(30, 20);
        a.multiply(2, 5);
    }
}
