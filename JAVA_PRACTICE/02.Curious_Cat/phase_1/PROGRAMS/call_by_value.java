public class call_by_value {
    void change(int i)
    {
        i = 40;
    }


    public static void main(String[] args) {
        call_by_value ob = new call_by_value();

        int x = 66;
        System.out.println("before call: " + x);

        ob.change(x);
        System.out.println("after call: " +x);

    }
}
