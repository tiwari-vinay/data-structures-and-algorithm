import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

import javax.swing.text.html.HTMLDocument.Iterator;

/**
 * dq
 */
public class dq {

    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        HashMap<Integer, Integer> m = new HashMap<>();
        ArrayList<Map.Entry<Integer, Integer>> res = new ArrayList<>();

        ArrayList<Integer> arr = new ArrayList<>();
        ArrayList<Integer> arr2 = new ArrayList<>(arr);
        arr.add(10);
        arr.add(5);
        arr.add(20);
        arr.add(5);
        arr.add(10);
        arr.add(10);
        arr.add(30);    
        arr.forEach(element -> {
            if(m.get(element) != null)
                m.put(element, m.get(element)+1);
            else
                m.put(element, 1);
        });

        for (Map.Entry<Integer, Integer> entry : m.entrySet()){
            res.add(entry);            
        }
     
        Collections.sort(res,(e1, e2) -> {
            return -e1.getValue() + e2.getValue();
        });
        
        for (Map.Entry<Integer, Integer> e : res)
            System.out.println(e.getKey()+":"+e.getValue());
    }
}