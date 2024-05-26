public class basic_encapsulation {
    // Private attributes
    private String name;
    private int age;
    protected String address; // Accessible to subclasses

    // Constructor
    public basic_encapsulation(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Setter for name
    public void setName(String name) {
        this.name = name;
    }

    // Getter for age
    public int getAge() {
        return age;
    }

    // Setter for age
    public void setAge(int age) {
        if (age >= 0) { // Validation to ensure age is non-negative
            this.age = age;
        } else {
            System.out.println("Age cannot be negative");
        }
    }

    // Method to display person's information
    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Address: " + address);
    }
    
}

