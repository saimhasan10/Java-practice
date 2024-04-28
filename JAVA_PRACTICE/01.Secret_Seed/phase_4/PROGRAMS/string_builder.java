public class string_builder {
    public static void main(String[] args) {
        StringBuilder str = new StringBuilder("let me dare to be me !! ");

        System.out.println("Before: " + str);

        str.append("The real Me ");

        System.out.println("After: " + str);

        str.delete(0, 10);
        System.out.println("After deletion: " + str);
    }
}
