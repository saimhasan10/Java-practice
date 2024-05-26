public class Student {
    String name;
    int id;
    static String University = "NUBT";

    Student(String name, int id) 
    {
        this.name = name;
        this.id = id;
    }

    void display()
    {
        System.out.println("Non static method ");
        System.out.println("Name: " + name + " id: " + id);
        System.out.println("University: " + University);
    }

    // static method
    static void display1()
    {
        System.out.println("static method 1 ");
    }
    
    // static method 2
    static void display2()
    {
        System.out.println("static method 2 ");
        University = "MIT";
    }
}
