public class car {
    private String name, origin;
    private int price;
    
    // using getter and setter
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getOrigin() {
        return origin;
    }
    public void setOrigin(String origin) {
        this.origin = origin;
    }
    public int getPrice() {
        return price;
    }
    public void setPrice(int price) {
        this.price = price;
    }

    void displayInformation()
    {
        System.out.println("Car name: " + getName());
        System.out.println("Car origin: " + getOrigin());
        System.out.println("Car price: " + getPrice());
    }
}
