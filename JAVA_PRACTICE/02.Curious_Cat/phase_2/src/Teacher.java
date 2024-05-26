

public class Teacher extends person {
    String qualification;


    void display()
    {
        System.out.println("Name: "+ name);
        System.out.println("Age: "+ age);
        System.out.println("Qualification: "+ qualification);
    }

    public static void main(String[] args) {
        Teacher t1 = new Teacher();
        t1.name = "Kabila";
        t1.age = 32;
        t1.qualification = "M.Sc in Badrami";
        t1.display();
    }
}
