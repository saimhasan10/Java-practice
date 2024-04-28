public class for_each_loop {
    public static void main(String[] args) {
        String [] names = new String[3];

        names[0] = "Tom";
        names[1] = "Jerry";
        names[2] = "Minions";

        for( String name : names )
        {
            System.out.println(name);
        }
    }
}
