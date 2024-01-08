package Strings;

import java.util.HashSet;

/*
 * Minimum length substring to be removed to make the string palindrome
 */
public class Eight {

    public static int areaOfMaxDiagonal(int[][] dimensions) {
        int max_area = Integer.MIN_VALUE;
        double cur_dia = Integer.MIN_VALUE;
        for (int[] arr: dimensions){
            int l = arr[0];
            int b = arr[1];
            double d = Math.sqrt(l*l+b*b);
            if (cur_dia < d)
            {
                max_area = l*b;
                cur_dia = d;
            }
            System.out.println(cur_dia);
        }
        return max_area;
    }
    
    public static void main(String[] args) {
        int[][] arr = {{9,3}, {8,6}};
        System.out.println(areaOfMaxDiagonal(arr));
        
    }
}
