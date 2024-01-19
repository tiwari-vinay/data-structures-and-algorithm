package Strings;

/**
 * Twelve
 */
public class Twelve {
    public static String sol(String s)
    {
        int n = s.length();
        String subs = "";
        subs += s.charAt(0);

        for(int i=0; i<n-1; i++)
        {
            if (s.charAt(i) != s.charAt(i+1))
                subs += s.charAt(i+1);
        }
        return subs;
    }
    public static void main(String[] args) {
        String s = "aabbb";
        System.out.println(sol(s)); 
    }
}