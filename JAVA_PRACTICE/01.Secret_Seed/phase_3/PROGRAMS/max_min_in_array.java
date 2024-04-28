import java.util.Scanner;

public class max_min_in_array {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the size of the array: ");
        int size = input.nextInt();
        int [] array = new int[size];

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;


        for(int i = 0; i < array.length; i++)
        {
            array[i] = input.nextInt();
        }

        for(int i = 0; i < array.length; i++)
        {
            if(array[i] > max)
            {
                max = array[i];
            }

            if (array[i] < min)
            {
                min = array[i];
            }
        }

        System.out.println("The maximum value is " + max);
        System.out.println("The minimum value is " + min);


        
    }
}
