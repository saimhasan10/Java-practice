public class Main {
    public static void main(String[] args) {
        Person p1 = new Person(65, 1.72);
        Person p2 = new Person(55, 1.77);
        p1.setName("Saim");
        p2.setName("Hasan");

        System.out.println("Name: " + p1.getName());
        p1.BMI(p1.getWeight(), p1.getHeight());

        System.out.println("Name: " + p2.getName());
        p2.BMI(p2.getWeight(), p2.getHeight());
    }
}
