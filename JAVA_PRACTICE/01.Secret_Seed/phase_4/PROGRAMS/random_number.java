import java.util.Random;

public class random_number {
    public static void main(String[] args) {


        int random_number = (int) Math.random()*10+1;
        System.out.println("Random number using math library: " + random_number);


        // using random class
        Random random = new Random();
        int random_number1 = random.nextInt(10)+1; // 0 to 10
        System.out.println("Random number using random class: " + random_number1);
    }
}
