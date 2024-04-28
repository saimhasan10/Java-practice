import java.util.Scanner;

public class palindrome_using_reverser {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the string: ");
        String str1 = input.nextLine();

        // reverser the string 
        StringBuffer rev = new StringBuffer(str1);

        // to hold the string buffer we need to covert it into the string
        String str2 = rev.reverse().toString(); 

        if(str1.equals(str2))
        {
            System.out.println(str1 + " is a palindrome ");
        }
        else
        {
            System.out.println(str1 + " is not a palindrome ");

        }


    }
}
