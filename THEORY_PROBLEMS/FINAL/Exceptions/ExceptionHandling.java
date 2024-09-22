public class ExceptionHandling {
    public static void main(String[] args) {
        try {
            int result = divideNumbers(10, 0);
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            // TODO: handle exception
            System.out.println("Error: " + e.getMessage());
        } finally {
            System.out.println("Finally block will always be executed");
        }
    }

    static int divideNumbers(int num, int denom) throws ArithmeticException {
        if (denom == 0) {
            throw new ArithmeticException("Division by zero is not allowed");
        }
        return num / denom;
    }
}
