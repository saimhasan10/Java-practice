/*
 * selection control
 * if else
*/


import java.util.Scanner;

public class selection_control_statement{

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num;
        System.out.println("Enter any number: ");
        num = input.nextInt();

        if(num<0)
        {
            if(num%2==0)
            {
                System.out.println(num+ " is a negative and even number");
            }
            else{
                System.out.println(num+ " is a negative and odd number");

            }
        }
        else if(num>0)
        {
            if (num % 2 == 0) {
                System.out.println(num + " is a positive and even number");
            } else {
                System.out.println(num + " is a positive and odd number");

            }
        }
        else{
            System.out.println("zero is not a valid input ");
        }
    }
}