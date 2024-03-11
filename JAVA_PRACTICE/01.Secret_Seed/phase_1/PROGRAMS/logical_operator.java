
/*
 * && logical AND
 * || logical OR (for this operator check the vowel and consonant problem in phase 2)
 * != not equal 
*/

import java.util.Scanner;

public class logical_operator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num;

        System.out.print("Enter any integer number: ");
        num = input.nextInt();

        if(num%2 ==0 && num >=0)
        {
            System.out.print("This number is positive and even ");
        }
        else if (num%2 == 0 && num< 0)
        {
            System.out.print("This number is negative and even");
        }
        else if (num%2 != 0 && num< 0)
        {
            System.out.print("This number is negative and odd");
        }
        else if (num%2 != 0 && num> 0)
        {
            System.out.print("This number is positive and odd");
        }
        else 
        {
            System.out.println("Enter any number without zero");
        }
    }
}
