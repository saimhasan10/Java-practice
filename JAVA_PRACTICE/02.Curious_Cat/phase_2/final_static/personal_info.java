
public class personal_info {
    String name;
    final String university = "NUBT";
    static final int fees;

    static 
    {
        fees = 30000;
    }

    void display()
    {
        System.out.println("Name: " + name);
        System.out.println("University: " + university);
        System.out.println("Fees: " + fees);
    }

    public static void main(String[] args) {
        personal_info obj = new personal_info();

        obj.name = "Ertugrul ghazi";
        obj.display();
    }

}