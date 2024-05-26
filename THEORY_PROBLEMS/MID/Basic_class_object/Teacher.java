public class Teacher {

    String name, gender;
    int age;

    // parameterized constructor
    Teacher(String n, String g, int a) {
        name = n;
        gender = g;
        age = a;
    }
    // default constructor
    Teacher()
    {
        System.out.println("Default constructor");
    }

    void displayInformations() {
        System.out.println("Teacher name: " + name);
        System.out.println("Teacher gender: " + gender);
        System.out.println("Teacher age: " + age);
    }

    public static void main(String[] args) {
        Teacher t1 = new Teacher("name", "Male", 22);
        t1.displayInformations();
                                        
        Teacher t2 = new Teacher(); // call the default constructor
    }

}

