import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

/**
 * JosephusProblem
 */
public class JosephusProblem {

    public static int survivor(List<?> list, int curIndex, int k){
        int indexToRemove = (curIndex+k)%list.size();
        list.remove(indexToRemove);
        curIndex = indexToRemove%list.size();
        if(list.size()>1)
            survivor(list, curIndex, k);
        return (int) list.get(0);
    }
    public static void main(String[] args) {
        List<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);

        ListIterator itr = list.listIterator(); 
        // every third perosn is killed and then the numbering starts form teh next elements
        int k = 3;
        int n = list.size();

        System.out.println(survivor(list, 0, k));
    }
}