public class Eight {
    
    // Function to check if a string is palindrome
    static boolean isPalindrome(String str) {
        int start = 0;
        int end = str.length() - 1;
        while (start < end) {
            if (str.charAt(start) != str.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
    
    // Recursive function to find the minimum substring to remove to make the string a palindrome
    static String removeSubstringForPalindrome(String S) {
        if (isPalindrome(S)) {
            return S; // If the entire string is already a palindrome, return as is
        }
        
        int start = 0;
        int end = S.length() - 1;
        
        while (start < end) {
            if (S.charAt(start) != S.charAt(end)) {
                // If characters are different, try removing either character and check palindrome
                String leftRemoved = removeSubstringForPalindrome(S.substring(0, start) + S.substring(start + 1));
                String rightRemoved = removeSubstringForPalindrome(S.substring(0, end) + S.substring(end + 1));
                
                // Return the substring that results in a palindrome after removal
                return leftRemoved.length() < rightRemoved.length() ? leftRemoved : rightRemoved;
            }
            start++;
            end--;
        }
        return S; // If the string is already a palindrome
    }
    
    // Example usage
    public static void main(String[] args) {
        String S1 = "pqrstsuvwrqp";
        String S2 = "geeksforskeeg";
        
        System.out.println("Input: " + S1);
        System.out.println("Output: " + removeSubstringForPalindrome(S1));
        
        System.out.println("\nInput: " + S2);
        System.out.println("Output: " + removeSubstringForPalindrome(S2));
    }
}
