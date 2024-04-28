public class basic_string {
    public static void main(String[] args) {

        String s1 = "Yesterday is History";
        String s2 = new String("Tomorrow is a Mystery");

        int len1 = s1.length();
        int len2 = s2.length();

        System.out.println("Length of first string: " + len1);
        System.out.println("Length of second string: " + len2);

        // compare the string with case sensitivity
        if(s1.equals(s2))
        {
            System.out.println("Equals");
        }
        else
        {
            System.out.println("Not equal");
        }

        // avoid case sensitivity 
        if(s1.equalsIgnoreCase(s2))
        {
            System.out.println("Equals");
        }
        else
        {
            System.out.println("Not equal");
        }

        // avoid case sensitivity 
        if(s1.contains(s2))
        {
            System.out.println("Equals");
        }
        else
        {
            System.out.println("Not equal");
        }
    }
}
