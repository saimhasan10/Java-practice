interface Fcatcal {
    int fact(int num);
}

public class LamdaFact {

    public static void main(String[] args) {
        Fcatcal fc = (num) -> {
            int result = 1;
            for (int i = 1; i <= num; i++) {
                result *= i;
            }
            return result;
        };
        int factResult = fc.fact(4);
        System.out.println("Factorial is: " + factResult);
    }
}