public class unary_operator {
    public static void main(String[] args) {
        // unary operator(can convert the current sign)
        int x=5;
        int result;

        result = +x;
        System.out.println("prefix plus x:"+result);

        result = -x;
        System.out.println(" prefix minus x:"+result);

        // increment
        ++x;
        System.out.println("post increment x:"+x);
        
        // decrement
        --x;
        System.out.println("post increment x:"+x);


    }
}
