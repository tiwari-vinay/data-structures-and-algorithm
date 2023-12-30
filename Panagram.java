import java.util.ArrayList;
import java.util.List;

public class Panagram {

    public static boolean checkPanagram(String s){
        int n = s.length();
        List<Integer> list = new ArrayList<>();
        for (int i=0; i<26; i++)
        {
            list.add(-1);
        }
        for (char c: s.toCharArray())
        {
            if(c>64 && c<91){
                list.set(c-65, 1);
            }  
            else if(c>94 && c<123)
                list.set(c-97,1);
        }
        boolean res = true;
        for (int x: list)
            if(x != 1)
                {res = false;
                break;}
        return res;
    }

    public static char findExtra(String s1,String s2)
    {
        int n1 = s1.length();
        int n2 = s2.length();
        if (n1>n2){
            for(char c : s2.toCharArray()){
                if(s1.indexOf(c)<0)
                    return c;
            }
        }
        else {
            for(char c: s1.toCharArray()){
                if(s2.indexOf(c)<0)
                    return c;
            }
        }

        return '\0';
    }
    public static void main(String[] args) {
        String s = "The quick brown fox jumps over lazy doG";
        System.out.println(checkPanagram(s));

        String s1 = "abcdef";
        String s2 = "abcde";
        char res = findExtra(s1, s2);
        System.out.println("Result is : " + res);
    }
}
