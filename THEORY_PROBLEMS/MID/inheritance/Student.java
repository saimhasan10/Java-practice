public class Student extends Person {
    int id;
    String section;
    void display2()
    {
        System.out.println("Child class");
        doit();
    }

    
    @Override
    void display1() {

        super.display1();
        System.out.println("ID: "+ id + " " + "Section: "+ section);

    }
}
