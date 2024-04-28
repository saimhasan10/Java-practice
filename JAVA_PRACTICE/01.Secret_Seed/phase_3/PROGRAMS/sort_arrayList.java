import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;


public class sort_arrayList {
    public static void main(String[] args) {
        ArrayList numbers = new ArrayList<>();

        numbers.add(10);
        numbers.add(3);
        numbers.add(7);
        numbers.add(2);
        numbers.add(1);

        System.out.println("Before sorting numbers: " + numbers);
        
        Collections.sort(numbers);        
        System.out.println("After sorting numbers in ascending: " + numbers);
        
        Collections.sort(numbers, Collections.reverseOrder());
        System.out.println("After sorting numbers in descending: " + numbers);

    }
}
