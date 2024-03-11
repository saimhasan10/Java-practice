import java.util.Scanner;

public class sum_and_palindrome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer number: ");
        int num = input.nextInt();
        int sum = 0;
        int rev = 0;
        int temp1 = num;
        int temp2 = num;

        // sum of the number
        while (temp1 != 0) {
            int rem = temp1 % 10;
            sum += rem;
            temp1 /= 10;
        }

        // reverse of the number
        while (temp2 != 0) {
            int rem = temp2 % 10;
            rev = rev * 10 + rem;
            temp2 /= 10;
        }

        // check palindrome
        if (rev == num) {
            System.out.println(num + " is a palindrome number");
        } else {
            System.out.println(num + " is not a palindrome number");
        }

        System.out.println("Sum of the digits: " + sum);

    }
}
