package Strings;

public class Fourteen {

    static int solution(String s1, String s2){
        String res = "";
        int i = 0, j = 0, n = s1.length(), m = s2.length();
        int count = 0;
        while(j < m){
            while (i<n){
                if (s1.charAt(i) == s2.charAt(j))
                {
                    res+=s1.charAt(i);
                    i++; j++;
                } 
                else i++;
            }
            i = 0;
            count++;
        }

        return count;
    }
    public static void main(String[] args) {
        String s1 = "abbace",
        s2 =        "acebbaae";
        System.out.println(solution(s1, s2));
    }
}
