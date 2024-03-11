import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int fact =1;
        System.out.println("Enter the number: ");
        int num = input.nextInt();

        for( int i = num; i>=1; i--)
        {
            fact = fact* i;
        }
        System.out.print("Factorial is: "+fact);

    }
}
