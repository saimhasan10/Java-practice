

public class student {
    String name;
    int id;
    double cgpa;
    static String university = "NUBT";
    static int count = 0;

    // default constructor
    student()
    {
        System.out.println("No information available!!!");
    }

    student(String n, int i)
    {
        name = n;
        id = i;
        count++;
    }
    
    // parameterized constructor 
    student(String n, int i, double cg)
    {
        name = n;                   
        id = i;
        cgpa = cg;
        count++;
    }

    void display(String name, int id, double cgpa)
    {
        System.out.println("Student name: " + name);
        System.out.println("Student id: " + id);
        System.out.println(" Student's cgpa: "+ cgpa);
    }

    void displayInfo()
    {
        System.out.println("Student name: " + name);
        System.out.println("Student id: " + id);
        System.out.println(" Student's cgpa: "+ cgpa);
        System.out.println(" University name: "+ university);

    }

    void totalStudent()
    {
        System.out.println("Total students: " +count);
    }

    // static method
    static void display3()
    {   
        System.out.println(" this is from static method");
    }

}


