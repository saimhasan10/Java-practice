public class StudentTest {
    public static void main(String[] args) {
        Student s = new Student("Saim", 897);
        s.display();
        s.display1();
        System.out.println("University name: "+ Student.University);
        s.display2();
        System.out.println("University name: "+ Student.University);
    }
}
