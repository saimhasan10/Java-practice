public class string_built_in_method {
    public static void main(String[] args) {
        String first_name = "Saim  ";
        String last_name = "Hasan";

        

        // string concatenations
        String full_name = first_name.concat(last_name);
        System.out.println("Full name: " + full_name);

        // convert to  upper case 
        String upperName = full_name.toUpperCase();
        System.out.println("Upper case is: " + upperName);

        // convert to  upper case 
        String lowerName = full_name.toLowerCase();
        System.out.println("Lower case is: " + lowerName);

        // check in starting 
        boolean start_check = first_name.startsWith("S");
        System.out.println("checking in starting: " + start_check);

        // check in ending
        boolean end_check = last_name.endsWith("san");
        System.out.println("checking in ending: " + end_check);

        // for each loop in string
        String [] names = {"Tom", "Jerry", "Rabbit", "Minions"};
        for (String name: names)
        {
            System.out.println(name);
        }
        
        // char find in a index
        char ch = first_name.charAt(1);
        System.out.println("character at index " + ch);

        // find the ASCII code
        int value = first_name.codePointAt(3);
        System.out.println("Code point at " + value);

        int pos = first_name.indexOf("m");
        System.out.println("Index " + pos);

        
    }
}
