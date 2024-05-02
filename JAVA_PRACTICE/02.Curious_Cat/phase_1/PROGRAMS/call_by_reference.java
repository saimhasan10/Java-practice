
public class call_by_reference {

    String name;

    void change(call_by_reference s)
    {
        s.name = "Mahmudullah ";
    }

    public static void main(String[] args) {
        // creating object
        call_by_reference obj = new call_by_reference();

        // declaring a value
        obj.name = "Tawhid";
        System.out.println("Before calling: " + obj.name);

        // pass the object
        obj.change(obj);
        System.out.println("After calling: " + obj.name);

    }
}
