public class static_block {
    static int id;
    static String name;

    static 
    {
        id = 15;
        name = "Musfiqur Rahim";
    }
    // static block will execute before the main method
    static void display()
    {
        System.out.println("This is from static_block");
        System.out.println("Id: " + id);
        System.out.println("Name: " + name);
    }

    public static void main(String[] args) {
        static_block.display();
        System.out.println("This is from main method");
    }
}
