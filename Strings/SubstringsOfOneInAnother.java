package Strings;

import java.util.HashMap;
import java.util.HashSet;

import javax.print.attribute.HashAttributeSet;

/**
 * SubstringsOfOneInAnother
 */
public class SubstringsOfOneInAnother {

    public static int solution(String s1, String s2){
        int cnt = 0;
        for (int i=0; i<s1.length(); i++){
            String subString = "";
            for (int j=i; j<s1.length(); j++){
                subString+=s1.charAt(j);
                if (s2.indexOf(subString) != -1){
                    cnt++;
                }
            }
        }

        return cnt;
    }

    public static String largestSubstringofKchars(String s, int k){
        if (k==0 || s.length()==0)
            return "";
        HashMap<Character, Integer> m = new HashMap<>();
        
        int start = 0;int maxStart = 0,max_len = 0;

        for (int end=0; end<s.length(); end++){
            char c = s.charAt(end);
            m.put(c, m.getOrDefault(c, 0)+1);

            while(m.size() > k)
            {
                char leftChar = s.charAt(start);
                m.put(leftChar, m.get(leftChar)-1);
                if (m.get(leftChar) == 0)
                    m.remove(leftChar);
                start++;
            }

            int currLen = end - start + 1;
            if (currLen > max_len) {
                max_len = currLen;
                maxStart = start;
            }
        }

        return s.substring(maxStart, maxStart+max_len);
    }
    public static void main(String[] args) {
        String s = "aabbccaaac";
        System.out.println(largestSubstringofKchars(s, 2));
    }
}