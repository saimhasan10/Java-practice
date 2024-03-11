public class format_specifers {

    public static void main(String[] args) {
        String name;
        int id, age;
        double gpa;
        boolean isRegisted;

        // initializing variables for a student
        name = "Saim Hasan";
        id = 220320897;
        age = 24;
        gpa = 0.00000;
        isRegisted = true;

        System.out.printf("Student Information using format specifier\n");
        System.out.printf("--------------------\n");
        System.out.printf("Name: %s\n", name);
        System.out.printf("ID: id %d\n", id);
        System.out.printf("Age: %d\n", age);
        System.out.printf("GPA: %f\n", gpa);
        System.out.printf("Registered:  %b\n", isRegisted);
    }
}
