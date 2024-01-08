package Matrix;

import java.util.Arrays;

public class One {
    /*
     * Given a 2D matrix mat[][] of size N*M and Q queries of the form {x1, y1, x2, y2, K}. For each query, the task is to add the value K to submatrix from cell (x1, y1) to (x2, y2). Print the matrix after all the queries performed
     */
    public static void solution(int[][] mat, int[][] queries){
        for(int i=0; i<queries.length; i++){
            int s_x = queries[i][0];
            int s_y = queries[i][1];
            int e_x = queries[i][2];
            int e_y = queries[i][3];
            int k = queries[i][4];

            // now what we can do we iterate form start to end and increment each cell by k
            for (int _x = s_x; _x<=e_x; _x++)
            {
                for(int _y=s_y; _y<=e_y; _y++){
                    mat[_x][_y] = mat[_x][_y] + k; 
                }
            }
        }
        printArray(mat);
    }

    public static void dpSolution (int[][] arr, int[][] queries)
    {
        // 1. make m+2,n+2 matrix and initialise it to 0;
        // 2. Apply mat[start_x][start_y] = k ;
        // 3. mat[start_x][end_y+1] - k; 
        // 4. mat[end_x+1][start_y] -k;
        // 5. mat[end_x+1][end_y+1] + k;

        // Then we have two approaches for further solution
        // 1. Calculate prefix sum of columns adn the rows and then proceed with step 6 
        //                         or
        // 2. Or calculate the difference array using follwing formula in thi case auxiliary matrix/diff matrix should be of dimension m+1 and n+1;
        //     diff[i][j] += diff[i][j-1] + diff[i-1][j] - diff[i-1][j-1];

        // 6. Then add all the members of this matrix to the original matrix to get the result matrix.
    }

    public static int maxSubMatrixSum(int[][] arr){
        int m = arr.length;
        int n = arr[0].length;
        
        int[][] dp = new int[m][n];

        int[] startArr = new int[arr.length];
        for (int i=0; i<arr.length; i++){

        }


        
        return 0;
    }

    public static int KadanesAlgorithm(int[] arr)
    {
        int max = Integer.MIN_VALUE;
        int max_till_now = 0;
        for (int i=0; i<arr.length; i++)
        {
            max_till_now = max_till_now + arr[i];
            max = Math.max(max, max_till_now);
            if (max_till_now<0) max_till_now = 0;
        }
        return max;
    }
    public static void printArray(int[][] arr)
    {
        int m = arr.length;
        int n = arr[0].length;
        for(int i=0; i<m; i++)
        {
            for(int j=0; j<n; j++)
                System.out.print(arr[i][j] + " ");
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int mat[][] = {{-1, 0, 1, 2}, {0, 2, 4, 1}, {1, 2, 1, 0}};
        int[][] querier = {{0, 0, 1, 1, 2}};

        for(int[] arr: mat) System.out.println(KadanesAlgorithm(arr));
    }
}
