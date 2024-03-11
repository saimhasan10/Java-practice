import java.util.Scanner;

public class switch_case {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int digit;
        System.out.print("Enter Digit between 0 to 3: ");
        digit = input.nextInt();

        switch(digit)
        {
            case 0:
            {
                System.out.print("You have entered zero");
                break;
            }
            case 1:
            {
                System.out.print("You have entered one");
                break;
            }
            case 2:
            {
                System.out.print("You have entered two");
                break;
            }
            case 3:
            {
                System.out.print("You have entered three");
                break;
            }
            default:
            {
                System.out.println(" incorrect digit");
            }
        }
    }
}
