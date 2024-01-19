package Strings;

/*
 * Question : count of susbtring which has all distinct chars 
 */
public class Four {
    public static int sol(String s){
        int[] cnt = new int[26];
        int ans = 0; 

        int end = 0; int start = 0;
        while(start < s.length()){
            if(end < s.length() && cnt[s.charAt(end) - 'a'] == 0)
            {
                cnt[s.charAt(end) - 'a']++;
                ans += end - start + 1;
                end++;
            }
            else {
                cnt[s.charAt(start)-'a']--;
                start++;
            }
        }

        return ans;
    }
    public static void main(String[] args) {
        String s = "abd";
        System.out.println(sol(s));   
    }
}
