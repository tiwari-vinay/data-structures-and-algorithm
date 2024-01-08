package Strings;

/**
 * LongestPalindromeSubstring
 */
public class LongestPalindromeSubstring {
    public static boolean isPalindrome(String s){
        int i=0, j=s.length()-1;
        while(i<j){
            if(s.charAt(i) != s.charAt(j))
                return false;
            i++; j--;
        }
        return true;
    }


    /*
     * not an ideal solution, a cubic time complexity
     */
    public static int solution(String s){
        int n = s.length();
        int maxLength = 0;
        for(int i=0; i<n; i++)
        {
            String x = "";
            for(int j=i; j<n; j++)
            {   
                x += s.charAt(j);
                if(isPalindrome(x))
                    maxLength = Math.max(maxLength, x.length());
            }
        }
        return maxLength;
    }

    public static String longesLengthSubstringSolution(String s){
        if (s == null || s.length() == 0)
            return "";
        int start = 0; 
        int end = 0;
        for (int i=0; i<s.length(); i++)
        {
            int len1 = expandFromCenter(s, i,i);
            int len2 = expandFromCenter(s, i, i+1);
            int max = Math.max(len1, len2);

            // this is very interesting here, we need to take care of both the cases here, 
            // to find out the starting and ending indices fo substring in both even and odd length cases, we need to consider start = i - (max_len-1)/2 and end = i+max_len/2
            if (max > end - start){
                start = i - (max-1)/2;
                end = i + max/2;
            }
        }

        return s.substring(start, end+1);

    }

    public static int expandFromCenter(String s, int left, int right){

        while (left >=0 && right<=s.length()-1 && s.charAt(left)==s.charAt(right)){
            left--; 
            right++;
        }

        return right-left-1;
    }
    public static void main(String[] args) {
        String s = "aaabbaa";
        System.out.println(solution(s));
        System.out.println(longesLengthSubstringSolution(s));
    }
}