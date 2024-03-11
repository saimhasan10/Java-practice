public class break_continue {
    public static void main(String[] args) {
        for(int i= 1; i< 100; i++) 
        {
            if ( i == 50 )
            continue; // 50 will skip

            if ( i == 80 )
            break;

            System.out.println("Operation number: "+i);
        }
    }
}
