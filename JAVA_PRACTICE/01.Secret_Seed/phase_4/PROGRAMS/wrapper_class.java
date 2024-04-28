
/* 
 * In java we use wrapper to convert primitive data types into objects also
 * objects into primitive types
*/


public class wrapper_class {
    public static void main(String[] args) {

        // Auto-boxing wrapper || primitive to object conversion
        int x = 97;
        Integer y = x;
        System.out.println("y = " + y);


        // unboxing wrapper ||  object to primitive conversion
        Double a = 98.99;
        double d = a;
        System.out.println("b = " + d);

        // double to string conversion
        double f = 2.33;
        String str = Double.toString(f);
        System.out.println("double to string = " + str);
        
        // boolean to string conversion
        boolean b = true;
        String str2 = Boolean.toString(b);
        System.out.println("boolean to string = " + str2);

        // string to integer conversion
        String n = "99";
        int i = Integer.parseInt(n);
        System.out.println("string to integer = " +i);
    }

}
