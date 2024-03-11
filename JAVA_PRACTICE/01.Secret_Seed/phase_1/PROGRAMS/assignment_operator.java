import java.util.Scanner;

public class assignment_operator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x,y;

        System.out.println("Enter two integer numbers:");
        x = input.nextInt();
        y = input.nextInt();

        x+=y;
        System.out.println("x = " +x);
        
        x-=y;
        System.out.println("x = " +x);

        x*=y;
        System.out.println("x = " +x);

        x/=y;
        System.out.println("x = " +x);

        x%=y;
        System.out.println("x = " +x);
    }
}
