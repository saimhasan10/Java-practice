public class expresion_2 extends expresion_1{
    int x = 99;

    @Override
    void display1() {
        super.display1();
        System.out.println("value of x from expresion: " + super.x);
    }

    public static void main(String[] args) {
        expresion_2 obj = new expresion_2();

        System.out.println("value of X = " + obj.x);
        obj.display1();
    }
}
