public class Employee {
    String name, gender;
    int age, salary;

    // default constructor
    Employee()
    {
        System.out.println("Default constructor");
    }
    // constructor with three parameters
    Employee(String name, String gender, int age)
    {
        this.name = name;
        this.gender = gender;
        this.age = age;
    }
    // constructor with four parameters
    Employee(String name, String gender, int age, int salary)
    {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.salary = salary;
    }
}
