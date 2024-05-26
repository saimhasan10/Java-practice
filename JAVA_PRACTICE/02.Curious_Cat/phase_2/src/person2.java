public class person2 extends Human{
    
    String gender;

    @Override
    void displayInformation() {
        System.out.println("Hair Color: " + hairColor);
        System.out.println("Age: " + age);
        System.out.println("Gender: " + gender);
    }

}
