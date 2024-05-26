public class test {
    public static void main(String[] args) {

        Person p1 = new Person();
        p1.display();

        p1 = new Teacher(); // refers the Teacher class
        p1.display();  
        p1 = new Student(); //  refers the Student class
        p1.display();

        // p1.display();
        // t1.display();
        // s1.display();
    }
}
