public class test2 {
    public static void main(String[] args) {

        Shape s1 = new Shape();
        Shape s2 = new Rectangle(10, 20);
        Shape s3 = new Triangle(20,15);

        // System.out.println("Shape: "+ s1.area());
        // System.out.println("Rectangle: "+ r1.area());
        // System.out.println("Triangle: "+ t1.area());

        // dynamic dispatch
        System.out.println("Shape: "+ s1.area());
        System.out.println("Rectangle: "+ s2.area());
        System.out.println("Triangle: "+ s3.area());


        //  if we use array
        /*
         * Shape [] s = new Shape[3];
         * 
         * s[0] = new Shape();
         * s[1] = new Rectangle(10, 20);
         * s[2] = new Triangle(20, 15);
         * 
         * for (int i = 0; i < 3; i++)
         * {
         * System.out.println(s[i].area());
         * }
         */


    }
}
