public class Triangle extends Shape {

    double base, height;

    Triangle (double base, double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    double area() {
        return 0.5*base * height;
    }
}
