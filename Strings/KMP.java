package Strings;
public class KMP {

    static int KMP(String s, String pattern){
        // ppart 1 : prepare the lps array 
        int[] lps = new int[pattern.length()];
        lps[0] = 0;
        
        int i=1; int prevLps = 0;
        
        while(i<pattern.length()){
            if(pattern.charAt(i) == pattern.charAt(prevLps)){
                lps[i] = prevLps + 1; 
                prevLps += 1;
                i++;
            }

            else if (prevLps == 0)
            {
                lps[i] = 0; 
                i++;
            }
            else {
                prevLps = lps[prevLps-1];
            }
        }

        // part2 : find out the patter using lps array and return -1 if not found

        i = 0; 
        int j = 0;
        while(i<s.length()){
            if (s.charAt(i)==pattern.charAt(j)){
                i++; j++;
            }
            else
                if (j==0)
                    i++;
                else 
                    j = lps[j-1];
            if (j==pattern.length())
                return (i-pattern.length());
        }

        return -1;

    }
    public static void main(String[] args) {
        String txt = "AAAAABAAABA"; String pat = "BAAABA";
        System.out.println(KMP(txt, pat));
    }
}
