// basic interface with default method

interface Vehicle {
    void cleanVhicle();

    // default method
    default void startVhicle() {
        System.out.println("Vehicle started");
    }
}

public class basic_interface implements Vehicle {

    @Override
    public void cleanVhicle() {
        System.out.println("Vehicle cleaned");
    }

    public static void main(String[] args) {
        basic_interface car = new basic_interface();
        car.cleanVhicle();
        car.startVhicle();
    }
}