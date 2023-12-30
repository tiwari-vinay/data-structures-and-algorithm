import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Pascal
 */
public class Pascal {

    public static List<List<Integer>> sol(int n){
        List<List<Integer>> res = new ArrayList<>();
        if(n<=0)
            return res;
        for (int i=0; i<n ;i++){
            List<Integer> list = new ArrayList();
            for (int j=0; j<=i; j++){
                if(j==i || j==0)
                    list.add(1);
                else{
                    int val = res.get(i-1).get(j-1) + res.get(i-1).get(j);
                    list.add(val);
                }
            }
            res.add(list);
        }
        return res;
    }
    public static void main(String[] args) {
        int n = 5;
        List<List<Integer>> res = sol(n);

        int count = n/2;
        StringBuilder filler = new StringBuilder("");
        for(int i=0; i<count; i++)
            filler.append(" ");
                
        for (List<Integer> list : res){
            for (int x: list){
                System.out.print(filler + Integer.toString(x));
            }

            System.out.println();
        }

        int[] arr = {1,2,5,4};
        Arrays.sort(arr);
        
        System.out.println(Arrays.toString(arr));
    }

}