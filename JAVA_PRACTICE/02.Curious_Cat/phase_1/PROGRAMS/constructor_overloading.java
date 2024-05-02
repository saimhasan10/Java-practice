public class constructor_overloading {
    public static void main(String[] args) {
        // creating object
        student s1 = new student();
        
        System.out.println("\n-------------------------");
        student s2 = new student("Raad ", 11);
        s2.displayInfo();

        System.out.println("\n-------------------------");
        student s3 = new student("Kudri",22, 2.5);
        s3.displayInfo();
    }
}
