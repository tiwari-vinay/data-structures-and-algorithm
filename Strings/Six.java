
/**
 * Smallest string which consisting of a string S k times
 * Approach is to find out the largest common prefix and suffix in string which is same
 * We can find it out by using the kmp algorithms to prepare the lps array
 */
public class Six {
    public static int[] LPS(String s){
        int[] lps = new int[s.length()];
        lps[0] = 0;

        int i = 1; int len = 0;

        while (i<s.length()){
            if (s.charAt(i) == s.charAt(len)){
                lps[i] = len + 1; 
                len += 1;
                i++;
            }

            else if (len == 0)
                lps[i++] = 0;
            else{
                lps[i] = lps[i-1];
            }
        }

        return lps;
    }

    static String solution(String s, int k)
    {
        int[] lps = LPS(s);
        String mini = s.substring(0,s.length()-lps[s.length()-1]);
        System.out.println(mini);
        String ans = "";
        for (int i=0; i<k-1; i++)
            ans+=mini;
        return ans+s;
    }
    
    public static void main(String[] args) {
        String s = "geeksforgeeks";
        System.out.println(solution(s, 3));
    }
}