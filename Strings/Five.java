package Strings;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Five {

    public static int solution(String s){
        HashMap<Character, Integer> m = new HashMap<>();
        int n = s.length();
        for (int i=n-1; i>=0; i--)
        {
            if (!m.containsKey(s.charAt(i)))
                m.put(s.charAt(i), i);
        }

        int partitions = 0;
        int k = m.get(s.charAt(0));

        for(int i=0; i<n; i++)
        {
            char c = s.charAt(i);

            if(i <= k)
            {
                k = Math.max(k, m.get(c));
            } else {
                partitions = partitions + 1;
                k = Math.max(k, m.get(c));
            }
        }

        return partitions;
    }
    public static void main(String[] args) {
     String s = "ababcbacadefegdehijhklij";
     System.out.println(solution(s));   
    }
}
