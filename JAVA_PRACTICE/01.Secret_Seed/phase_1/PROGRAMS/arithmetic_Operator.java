import java.util.Scanner;

public class arithmetic_Operator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num1,num2, result;

        System.out.print("Enter the first number:");
        num1 = input.nextInt();

        System.out.print("Enter the Second number:");
        num2 = input.nextInt();

        // sum
        result = num1 + num2;
        System.out.println("Sum of the two numbers: "+result);

        // sub
        result = num1 - num2;
        System.out.println("subtract the two numbers: "+result);

        // multiply
        result = num1 * num2;
        System.out.println("Multiplication the two numbers: "+result);

        // division
        result = num1 / num2;
        System.out.println("Division the two numbers: "+result);

        // modulus
        result = num1 % num2;
        System.out.println("Modulus the two numbers: "+result);

    }
}
