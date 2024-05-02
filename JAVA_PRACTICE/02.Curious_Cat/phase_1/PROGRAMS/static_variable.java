
// look inside the student class also

public class static_variable {

    public static void main(String[] args) {
        student s1 = new student("Menk", 88, 4.8);
        s1.displayInfo();

        System.out.println("\n================================\n");
        student s2 = new student("Mosh", 99, 4.9);
        s2.displayInfo();
        System.out.println("\n================================\n");

        s2.totalStudent();
    }
}
