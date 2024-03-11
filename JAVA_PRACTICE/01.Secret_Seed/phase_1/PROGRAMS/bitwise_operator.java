public class bitwise_operator {
    public static void main(String[] args) {
        int x = 5;
        int y = 6;
        int result;

        // bitwise AND
        result = x & y;
        System.out.println("x & y :"+result);
        
        // bitwise OR
        result = x | y;
        System.out.println("x | y : "+result);

        // bitwise EXOR
        result = x ^ y;
        System.out.println("x ^ y : "+result);

        // bitwise shift right
        result = y >>2;
        System.out.println("x >> 2 : "+result);

        // bitwise shift left
        result = y << 2;
        System.out.println("x << 2 : "+result);
    }
}
