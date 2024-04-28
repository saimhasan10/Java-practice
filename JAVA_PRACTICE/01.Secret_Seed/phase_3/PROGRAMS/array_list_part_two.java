import java.util.ArrayList;


public class array_list_part_two {
    public static void main(String[] args) {
        ArrayList<Integer> numbers1 = new ArrayList<>();
        ArrayList<Integer> numbers2 = new ArrayList<>();
        ArrayList<Integer> numbers3 = new ArrayList<>();

        numbers1.add(10);
        numbers1.add(20);
        numbers1.add(30);
        numbers1.add(40);

        numbers2.add(11);
        numbers2.add(22);
        numbers2.add(33);
        numbers2.add(44);
        
        numbers3.add(1);
        numbers3.add(2);
        numbers3.add(3);
        numbers3.add(4);


        // Adding the numbers1 last of the numbers3
        numbers3.addAll(numbers1);

        System.out.println("\n Numbers 1: " + numbers1);
        System.out.println("\n Numbers 2: " + numbers2);
        System.out.println("\n Numbers 3: " + numbers3);
        
        // checking two list are equal or not
        boolean isEqual = numbers1.equals(numbers3);
        System.out.println("\n numbers1 == numbers3: "+isEqual);

    }
}
