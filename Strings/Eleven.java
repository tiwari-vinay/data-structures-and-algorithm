/**
 * Eleven
 */
import java.util.*;

/*
 * Method 1 : All the methods of generating subsequences of a string are having time complexity of 2^n
 */
public class Eleven {
    public static void printSubsequence(String s, ArrayList<String> list, String str, int n)
    {
        if(s.length() == 0){
            list.add(str);
            return;
        }

        printSubsequence(s.substring(1), list, str+s.charAt(0), n);
        printSubsequence(s.substring(1), list, str, n);
    }


    static void printSubsequenceUsingPowerSet(String s, ArrayList<String> list, int n){
        for (int i=0; i<Math.pow(2, n); i++){
            String sq = "";
            for(int j=0; j<n; j++){
                if ((i&(1<<j)) > 0){
                    sq += s.charAt(j);
                }
            }

            list.add(sq);
        }
    }
    public static void main(String[] args) {
        String s = "ABC";
        ArrayList<String> list = new ArrayList<>();
        printSubsequenceUsingPowerSet(s, list,s.length());
        System.out.println(list);
    }
}