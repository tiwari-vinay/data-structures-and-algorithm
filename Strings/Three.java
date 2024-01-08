package Strings;

import java.util.ArrayDeque;

public class Three {


    public static int solution(String s){
        int n = s.length();
        ArrayDeque<Character> d = new ArrayDeque<>();
        for(int i=0; i<n; i++)
        {
            String x = "";
            for(int j=i; j<n; j++)
            {
                x+=s.charAt(j);
                
            }
        }
        return 0;
    }
    public static void main(String[] args) {
        String s = "haaaahaabsaa";
        System.out.println(solution(s));
    }
}