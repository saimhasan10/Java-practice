import java.util.Scanner;

public class vowel_consonant {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char ch;
        System.out.print("Enter any character: ");
        ch = input.next().charAt(0);

        if(ch == 'a' || ch == 'A' || ch == 'e' || ch == 'E' || ch == 'i' || ch == 'I' || ch == 'o' || ch == 'O' || ch == 'u' || ch == 'U')
        {
            System.out.print("This is a vowel");
        }
        else
        {
            System.out.print("This is a consonant");
        }
    }
}
