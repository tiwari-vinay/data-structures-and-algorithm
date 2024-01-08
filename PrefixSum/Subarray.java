package PrefixSum;
import java.util.*;

/**
 * SubArraySumZero
 */
public class Subarray {
    /**
     * 
        finding out the equilibrium point : the equilibrium point is the point where left sum and right sum are equal
     */
    public static int equilibriumPoint(int arr[], int n) {
        
        int left[] = new int[arr.length];
        left[0] = arr[0];
        for(int i=1; i<arr.length; i++)
            left[i] += left[i-1]+arr[i];

        int[] right = new int[arr.length];
        right[n-1] = arr[arr.length-1];
        for(int j=arr.length-2; j>=0; j--){
            right[j] = arr[j] + right[j+1];
        }
       
        System.out.println(Arrays.toString(left));
        System.out.println(Arrays.toString(right));
        for (int i=0; i<n; i++){
            if(left[i]-arr[i] == right[i]-arr[i])
                return i+1;
        }
        
        return -1;
    }

    /**
     * 
     * Subarray 
     */
    public static void subArray(int[] arr)
    {

    }

    public static boolean subarrayWithSumZero(int[] arr){
        /*Method 1 */   
        // for(int i=0; i<arr.length; i++)
        // {
        //     int sum =0;
        //     for(int j=0; j<arr.length; j++)
        //     {
        //         sum+=arr[j];
        //         if(sum==0)
        //             return true;
        //     }
        // }
        // return false;

        /*Method 2 : Based on the fact that if the prefix sum is already seen then array must be having subarray whose sum is zero*/

        HashSet<Integer> s = new HashSet<>();
        int sum = 0;
        for(int i=0; i<arr.length; i++)
        {
            sum += arr[i];
            if(sum == 0 || arr[i]==0 || !s.add(sum)) return true;
        }
        return false;
    }

    public static int largestSubarrayWithSumModKisZero(int arr){

        return 0;
    }

    public static int maxSubaraySum(int[] arr)
    {
        int max_sum = arr[0], sum_till_now = arr[0];
        int i=1; int j=0; 
        while(i<arr.length){
            sum_till_now += arr[i];
            max_sum = Math.max(sum_till_now, max_sum);
            if(sum_till_now < 0)
                sum_till_now = 0;
                i++;
        }

        return max_sum;
    }

    public static int maximumLength(String s) {
        Map<String, Integer> m = new HashMap<>();
        int n = s.length();
        int longest = -1;
        String l_str="";
    
        for (int i = 0; i < n-1; i++) {
            for (int j = i + 1; j <= n; j++) {
                String str = s.substring(i, j);
                m.put(str, m.getOrDefault(str, 0) + 1);
            }
        }
    
        for (Map.Entry<String, Integer> x : m.entrySet()) {
            if (x.getValue() >= 3) {
                longest = Math.max(x.getKey().length(), longest);
                l_str = x.getKey();
            }
        }
        System.out.println(l_str);
        return longest;
    }
    // public static int maximumLength(String s) {
    //     int maxLength = -1;
    //     int n = s.length();
    
    //     for (int i = 0; i < n - 2; i++) {
    //         for (int j = i + 1; j < n - 1; j++) {
    //             String substr = s.substring(i, j + 1);
    //             int count = countSubstringOccurrences(s, substr);
    
    //             if (count >= 3) {
    //                 maxLength = Math.max(maxLength, substr.length());
    //             }
    //         }
    //     }
    
    //     return maxLength;
    // }
    
    private static int countSubstringOccurrences(String s, String substr) {
        int count = 0;
        int index = s.indexOf(substr);
    
        while (index != -1) {
            count++;
            index = s.indexOf(substr, index + 1);
        }
    
        return count;
    }

    /*Question: Maximum subarray with sum % k == 0 */

    public static int maxSumDivisibleK(int[] arr, int sum, int n, int k){
        if(sum%k == 0)
            return n+1;
        if(n<0)
            return -1;
        else{
            return Math.max(maxSumDivisibleK(arr,sum-arr[n], n-1, k), maxSumDivisibleK(arr, sum, n-1, k));
        }
    }
    

    public static void main(String[] args) {
        int[] arr = {1,4,6,1,0,8};
        int sum = Arrays.stream(arr).sum();
        System.out.println(maxSumDivisibleK(arr, sum, arr.length-1, 3));
    }   
}