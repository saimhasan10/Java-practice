import java.util.Scanner;

public class sum_avg_of_array {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter the size of the array: ");
        int size = input.nextInt();

        int [] array = new int [size];
        System.out.println("Enter the elements of the array: ");

        int sum=0;

        for(int i =0; i < array.length; i++)
        {
            array[i] = input.nextInt();
            sum += array[i];
        }
        int avg = sum / array.length;

        System.out.println("the sum of the elements of the array: " + sum);
        System.out.println("the average of the elements of the array: " + avg);        

    }

}
