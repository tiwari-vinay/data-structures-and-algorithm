package Strings;

import java.util.*;

/**
 * Question : Find the longest substring which contains all characters count to be minimum of k
 */
public class Nine {

    static String solution(String s, int start , int end, int  k){

        int freq[] = new int[26];
        for (int i=start; i<=end; i++) freq[s.charAt(i) - 'a']++;

        if (end-start+1 < k)
            return "";
        
        for (int i=start; i<=end; i++){
            // if freq[i] < k, split the string in two halves;
            if (freq[s.charAt(i) - 'a'] < k){
                String left = solution(s, start, i-1, k); 
                String right = solution (s, i+1, end , k);
                
                int n1 = left.length(); 
                int n2 = right.length();

                return (n1>n2) ? left:right;
            }
        }

        return s.substring(start, end+1);
    }
    /*
     * time complexity of above approcah is N * logN, so we need better approach probably linear time complexity solution
     */
    public static void main(String[] args) {
        String s = "abababababaacb";
        String ans = solution(s, 0, s.length()-1, 3);
        System.out.println(ans.length());
        System.out.println(ans);
        Map<Character, Integer> m = new HashMap<>();
        m.put('a', m.getOrDefault(m, null));
    }
}