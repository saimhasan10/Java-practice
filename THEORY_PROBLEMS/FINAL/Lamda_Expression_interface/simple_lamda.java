interface In {
    int method(int num1, int num2);
}

public class simple_lamda {

    public static void main(String[] args) {
        In add = (n1, n2) -> {
            System.out.println("adding " + (n1 + n2));
            return n1 + n2;
        };
        int result = add.method(10, 20);
        System.out.println("sum : " + result);
    }
}