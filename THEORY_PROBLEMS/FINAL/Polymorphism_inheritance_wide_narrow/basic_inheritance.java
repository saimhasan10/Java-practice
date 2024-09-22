class Occupation {
    void work() {
        System.out.println("General Occupation");
    }
}

class Engineer extends Occupation {
    void work() {
        System.out.println("Engineering Occupation");
    }
}

/**
 * basic_polymorphism
 */
public class basic_inheritance {

    public static void main(String[] args) {
        Occupation occupation = new Engineer(); // pointing engineering occupation but reference Occupation
        occupation.work(); // Output: Engineering Occupation
    }
}