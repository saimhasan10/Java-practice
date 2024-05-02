public class method_overloading {
    void add()
    {
        System.out.println("This is a add method without any parameters");
    }

    void add(int a,int b)
    {
        System.out.println("This is a add method with two parameters: " + a + " + " + b + " = " + (a + b));
    }

    void add(double x, double y, double z)
    {
        System.out.println("This is a add method with two parameters: " + x + " + " + y + " + "+ z + " = " + (x + y +z));
    }

    public static void main(String[] args) {
        method_overloading obj = new method_overloading();
        obj.add();
        obj.add(5,6);
        obj.add(5.5, 7.7, 9.9);
        
    }
}
