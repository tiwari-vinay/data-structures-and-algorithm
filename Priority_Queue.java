import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.PriorityQueue;

/**
 * Priority_Queue
 */
public class Priority_Queue {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList();
        list.add(10);
        list.add(30);
        list.add(10);
        list.add(20);
        list.add(20);

        HashSet<Integer> s = new HashSet(list);
        for (int x: s){
            list.remove((Integer) x);
        }
        System.out.println(list);
    }
}
