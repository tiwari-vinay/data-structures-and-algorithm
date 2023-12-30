import java.util.Collection;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

class IteratorExample {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Orange");
        list.add("Banana");

        // Obtain Iterator from the List
        Iterator<String> iterator = list.iterator();

        // Traverse through the List using the Iterator
        while (iterator.hasNext()) {
            String element = iterator.next();
            System.out.println(element);
        }
        
    }
}
