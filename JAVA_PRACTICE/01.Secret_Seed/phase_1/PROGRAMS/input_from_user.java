import java.util.Scanner;

public class input_from_user {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // variables
        int number;
        double number2;
        String name;
        boolean isEmpty;

        // integer number input
        System.out.print("Enter any integer number: ");
        number = input.nextInt();

        // double number input
        System.out.print("Enter any double number: ");
        number2 = input.nextDouble();

        // string input
        System.out.print("Enter your name: ");
        name = input.nextLine();
        input.nextLine();
        // boolean input
        System.out.print("Is he registered? ");
        isEmpty = input.nextBoolean();

        // print 
        System.out.println("Number you entered: "+number);
        System.out.println("Number you entered: "+number2);
        System.out.println("Hey "+name);
        System.out.println(isEmpty);

        
    }
} 