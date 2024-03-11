import java.util.Scanner;

public class digit_spell {
    public static void main(String[] args) {
        int num;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter any number between 0 to 9: ");
        num = input.nextInt();

        if (num == 0)
        {
            System.out.printf("Spelling of %d is: zero", num);
        }
        else if (num == 1)
        {
            System.out.printf("Spelling of %d is: one", num);
        }
        else if (num == 2)
        {
            System.out.printf("Spelling of %d is: two", num);
        }
        else if (num == 3)
        {
            System.out.printf("Spelling of %d is: three", num);
        }
        else if (num == 4)
        {
            System.out.printf("Spelling of %d is: four", num);
        }
        else if (num == 5)
        {
            System.out.printf("Spelling of %d is: five", num);
        }
        else if (num == 6)
        {
            System.out.printf("Spelling of %d is: six", num);
        }
        else if (num == 7)
        {
            System.out.printf("Spelling of %d is: seven", num);
        }
        else if (num == 8)
        {
            System.out.printf("Spelling of %d is: eight", num);
        }
        else if (num == 9)
        {
            System.out.printf("Spelling of %d is: nine", num);
        }
        else 
        {
            System.out.print("Invalid number");
        }
    }   
}
