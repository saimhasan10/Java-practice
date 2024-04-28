import java.util.Arrays;

public class sorting_array {
    public static void main(String[] args) {
        int []  numbers =  {1, 3, 7, 2, 9, 6};

        Arrays.sort(numbers);

        System.out.println("Ascending order: ");
        for(int i =0; i < numbers.length; i++) 
        {
            System.out.println(" "+ numbers[i]);
        }

        System.out.println("Descending order: ");
        for(int i = numbers.length; i >0; i++) 
        {
            System.out.println(" "+ numbers[i]);
        }
    }
}
