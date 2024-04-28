public class string_buffer {
    public static void main(String[] args) {
        StringBuffer str = new StringBuffer("Today is a gift!!");

        System.out.println("Before: "+str);

        str.append("That is why it is called present!!");

        System.out.println("After: "+str);

        str.delete(0,9);
        System.out.println("After deletion: "+str);
    }
}
