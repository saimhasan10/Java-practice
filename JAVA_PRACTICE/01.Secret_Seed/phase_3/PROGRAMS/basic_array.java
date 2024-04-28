// collection of variable of same data type


public class basic_array {
    public static void main(String[] args) {
        
        // array deletion and creation

        /*  
         * int [] numbers;
         * numbers = new int [5];
         */

        int [] numbers = new int[5];

        numbers[0] = 0;
        numbers[1] = 1;
        numbers[2] = 2;
        numbers[3] = 3;
        numbers[4] = 4;

        int len = numbers.length;
        System.out.println("Size of the array: " +len);

        for( int num : numbers )
        {
            System.out.println(num);
        }

    }
}
