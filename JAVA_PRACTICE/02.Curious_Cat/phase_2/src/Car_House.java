public class Car_House extends car {
    String brand;

    public static void main(String[] args) {
        
        Car_House obj1 = new Car_House();
        Car_House obj2 = new Car_House();

        obj1.setName("GTR");
        obj1.setOrigin("Japan");
        obj1.setPrice(350000);
        obj1.displayInformation();


        obj2.setName("G wagon");
        obj2.setOrigin("Germany");
        obj2.setPrice(4500000);
        obj2.displayInformation();

        // instanceof check means is obj1 is a object of Car_house or not
        System.out.println(obj1 instanceof Car_House);

        

}

}
