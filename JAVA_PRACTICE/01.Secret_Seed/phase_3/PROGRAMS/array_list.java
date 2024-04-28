// To print the ArrayList we use for each loop or iterator
// Using multiple method from ArrayList

import java.util.ArrayList;
import java.util.Iterator;

public class array_list {
    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();
        
        // // adding elements to the list without index 
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);

        for(int num : numbers)
        {
            System.out.print(" "+num);
        }
        System.out.println("\n size of the list: "+numbers.size());

        // remove elements from the list
        numbers.remove(3);
        

        // adding elements to the list with index numbers
        numbers.add(0,90);
        numbers.add(1,10);
        numbers.add(4,40);
        numbers.add(2,20);
        numbers.add(3,30);

        // using iterators to print the list
        Iterator itr = numbers.iterator();

        while(itr.hasNext())
        {
            System.out.print(" "+itr.next());
        }

        // to clear the  list
        // numbers.clear();

        //  check empty or not
        boolean empty = numbers.isEmpty();
        System.out.println("\n Is empty: " + empty);

        // contain value or not
        boolean contain = numbers.contains(40);
        System.out.println("\n Contains value: " + contain);

        // find the index of an element
        int pos = numbers.indexOf(40);
        System.out.println("\n Index: " + pos);

        // replace an element into the list
        numbers.set(4, 99);
        System.out.println("\n After set an element: "+ numbers);

        // get a value from the list
        int value = numbers.get(8);
        System.out.println("\n Value: "+ value);
    }
}
