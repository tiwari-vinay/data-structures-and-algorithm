import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 * Temp
 */
public class Temp {

    public static StringBuilder removeChar(StringBuilder s, char c){
        int index = s.indexOf(String.valueOf(c));
        String tmp = s.substring(0, index)+s.substring(index+1, s.length());
        return new StringBuilder(tmp);
    }
    public static String shortestCompletingWord(String licensePlate, String[] words) {
        //shortest word which contains all the letter of the word of licence plate
        StringBuilder lp = new StringBuilder("");
        for(Character c: licensePlate.toCharArray()){
            if (c == ' ' || (c >='0' && c<='9'))
                continue;
            else 
                lp.append(Character.toLowerCase(c));
        }
        int minLength = Integer.MAX_VALUE;
        String ans = "";
        for(String w: words){
           StringBuilder word = new StringBuilder(w);
           boolean foundAll = true;
           int wordLen= word.length();
           for(int i=0; i<lp.length(); i++){
            if (word.indexOf(String.valueOf(lp.charAt(i))) == -1){
                foundAll = false;
                break;
            }
            else{
                word = removeChar(word, lp.charAt(i));
                System.out.println(word);
            }
           }
           if (foundAll && wordLen < minLength)
            {
                ans = w;
                minLength = wordLen;
            }
        }
    
        return ans;
    }
    public static void main(String[] args) {
        String licensePlate = "1s3 PSt"; String[] words = {"step","steps","stripe","stepple"};
        String ans = shortestCompletingWord(licensePlate, words);
        System.out.println("ans is : "+ans);
        System.out.println(ans.length());
    };  
}
