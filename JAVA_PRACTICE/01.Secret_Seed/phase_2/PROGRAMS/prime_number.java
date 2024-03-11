import java.util.Scanner;

public class prime_number {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter any integer number: ");
        int num = input.nextInt();
        int count = 0;

        if(num == 0 || num ==1) {
            System.out.println(num+ "is not a prime number");
        }
        else 
        {
            for (int i = 2; i < num/2; i++) {
                if (num % i == 0) {
                    count++;
                    break;
                }
            }
        }
        if (count == 0) {
            System.out.println(num + " is a prime number");
        } else {
            System.out.println(num + " is not a prime number");
        }
    }
}
