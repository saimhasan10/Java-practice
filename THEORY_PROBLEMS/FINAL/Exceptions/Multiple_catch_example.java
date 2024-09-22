/**
 * Multiple_catch_example
 */
public class Multiple_catch_example {

    public static void main(String[] args) {
        try {
            int[] numbers = { 1, 2, 3 };
            int result = numbers[3] / 0;
            System.out.println("Result: " + result);

        } catch (ArrayIndexOutOfBoundsException e) {
            // TODO: handle exception
            System.out.println("Error: Index out of bounds");
        } catch (ArithmeticException e) {
            System.out.println("Error: Division by zero");
        } finally {
            System.out.println(" This mamur beta will always executed");
        }
    }
}