package Strings;

import java.util.HashSet;
import java.util.*;

public class Thriteen {
    static void helper(String s1, String s2, Set<String> set, int i, int j, String res){
        if (res.length() == s1.length()+s2.length())
            set.add(res);

        if (i<s1.length()){
            helper(s1,s2,set,i+1, j, res+s1.charAt(i));
        }
        if(j<s2.length())
            helper(s1,s2,set, i,j+1, res+s2.charAt(j));
    }
    static void solution(String s1, String s2,  Set<String> set){
        helper(s1,s2,set, 0,0,"");
    }
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        String s1 = "de", s2 = "ab";
        solution(s1, s2, set);
        System.out.println(set);
    }
}
