import java.util.*;

class TrieNode{
    HashMap<Character, TrieNode> children;
    boolean endOfWord; 

    public TrieNode(){
        this.children = new HashMap<>();
        endOfWord = false;
    }
}
class Tries{
    // 1. Initialize
    TrieNode root;
    static int cnt;
    Tries(){
        this.root = new TrieNode();
        cnt++;
    }

    int size(){
        return cnt;
    }
    // 2. Insert
    void insert(String s){
        
        TrieNode cur = root;
        
        for (char c : s.toCharArray()){
            cur.children.putIfAbsent(c, new TrieNode());
            cur = cur.children.get(c);
        }
        cur.endOfWord = true;
    }

    boolean search(String s){
        
        TrieNode cur = root;
        
        for (char c : s.toCharArray()){
            if(cur.children.get(c) != null){
                cur = cur.children.get(c);
            }
            else{
                return false;
            }
        }
        return cur.endOfWord;
    }

    boolean startWith(String s){
        
        TrieNode cur = root;
        
        for (char c : s.toCharArray()){
            if (cur.children.get(c) != null){
                cur = cur.children.get(c);
            }
            else 
                return false;
        }
        return true;
    }
}

/**
 * Implementation
 */
public class Implementation {

    public static void main(String[] args) {
        Tries t = new Tries();
        String s = "Hello";
        String s2 = "he";
        t.insert(s);
        int count = 0; 
        for (int i=0; i<s2.length(); i++)
        {
            String sub = "";
            for(int j=i; j<s2.length(); j++)
            {
                sub+=s2.charAt(j);
                if(t.startWith(sub))
                    count++;
            }
        }

        System.out.println("Total numebr of substring of s2 is : " + count);
    }
}
