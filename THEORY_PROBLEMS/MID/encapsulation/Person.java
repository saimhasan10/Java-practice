public class Person {

    private String name;
    private int weight;
    private double height;

    Person(int weight, double height) 
    {
        this.weight = weight;
        this.height = height;
    }

    // setter
    public void setName(String n)
    {
        name = n;
    }
    // getter
    public String getName()
    {
        return name;
    }
    // getter
    public int getWeight()
    {
        return weight;
    }
    // getter
    public double getHeight()
    {
        return height;  
    }

    // BMI calculation
    public void BMI(int w, double h)
    {
        double bmi = w / (h* h);
        System.out.println("BMI: "+bmi);
    }
}