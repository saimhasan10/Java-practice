public class Teacher {
    
    String name, gender;
    int age;

    void setinformation(String n, String g, int a)
    {
        name = n;
        gender = g;
        age = a;
    }

    void displayInformations() {   
        System.out.println("Teacher name: " + name);
        System.out.println("Teacher gender: " + gender);
        System.out.println("Teacher age: " + age);
    }
    
}
