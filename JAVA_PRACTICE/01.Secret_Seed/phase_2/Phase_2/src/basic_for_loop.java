import java.util.Scanner;

public class basic_for_loop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        

        System.out.print("How many times you want to show your message? : ");
        int num = input.nextInt();

        input.nextLine();
        System.out.print("Enter you message here: ");
        String message = input.nextLine();

        for(int i = 1; i <= num; i++) {
            System.out.printf("count %d: %s \n",i,message);
        }
    }
}
