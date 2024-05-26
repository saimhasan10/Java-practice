import java.io.*;

public class exceptions_handling {

    public static void main(String[] args) {
        try {
            // Code that may throw an exception
            int result = divide(10, 0);
            System.out.println("Result: " + result);
        } 

        catch (ArithmeticException e) {
            // Catch block to handle specific exceptions
            System.out.println("ArithmeticException caught: " + e.getMessage());
        } 
        
        
        catch (Exception e) {
            // Catch block to handle any other exceptions
            System.out.println("Exception caught: " + e.getMessage());
        } 
        
        finally {
            // Finally block always executes, regardless of whether an exception occurs
            System.out.println("Finally block executed");
        }

        try {
            // Code that throws a checked exception
            readFile("nonexistent.txt");
        } 
        
        catch (FileNotFoundException e) {
            // Catch block to handle specific checked exceptions
            System.out.println("FileNotFoundException caught: " + e.getMessage());
        } 
        
        finally {
            // Finally block always executes, regardless of whether an exception occurs
            System.out.println("Finally block executed");
        }

        // Example of throwing an exception manually
        try {
            throwCustomException();
        }
        
        catch (CustomException e) {
            // Catch block to handle custom exceptions
            System.out.println("CustomException caught: " + e.getMessage());
        }
    }

    // Method that throws an arithmetic exception
    public static int divide(int num1, int num2) {
        return num1 / num2;
    }

    // Method that throws a checked exception
    public static void readFile(String filename) throws FileNotFoundException {
        FileReader fileReader = new FileReader(filename);
        // Code to read the file
    }

    // Method that throws a custom exception
    public static void throwCustomException() throws CustomException {
        throw new CustomException("Custom exception thrown");
    }
}

// Custom exception class
class CustomException extends Exception {
    public CustomException(String message) {
        super(message);
    }
}
