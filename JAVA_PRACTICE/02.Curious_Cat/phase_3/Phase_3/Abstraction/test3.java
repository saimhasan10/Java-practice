public class test3 {
    public static void main(String[] args) {
        MobileUser mu; // reference variable

        mu = new User_one();
        mu.sendMessage();

        mu = new User_two();
        mu.sendMessage();
    }
}
