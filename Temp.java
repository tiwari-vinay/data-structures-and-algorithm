import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.function.Predicate;

class Point{
    int x; 
    int y;
    Point(){
        this.x = 0;
        this.y = 0;
    }
    Point(int x, int y){
        this.x = x;
        this.y = y;
    }
    String print(){
        return this.x + "," + this.y;
    }
}

class Point_3D extends Point{
    int z;
    Point_3D(){
        this.z = 0;
    }
    Point_3D(int x, int y, int z){
        super(x,y) ;
        this.z = z;
    }
    @Override
    String print(){
        return super.print() + "," + this.y;
    }
}


class Temp{
    // here Predicate in functional interface - which has exactly one abstract method.
    // in print static method we are expecting an object which implements the functional interface Predicate and provide the definition of test. Either we declare a class which implements the predicate and provide the definition of test method or we could just provide a lambda funciton which will eventually be the definition of lambda expression as there is only abstract method in functional interface. 

    static void print(Collection<Integer> a, Predicate<Integer> p){
        for (Integer x: a)
            if (p.test(x))
                System.out.println(x);
    } 
    static void printArr(int[][] arr){
        for (int[] a : arr){
            for (int x : a) 
                System.out.print(x+ " ");
            System.out.println();
        }
    }
    static void makeZero(int[][] arr, int p, int q){
        int m = arr.length;
        int n = arr[0].length;

        for (int i=0; i<m; i++)
            arr[i][q] = 0;
        for (int i=0; i<n; i++)
            arr[p][i] = 0;

    }
    static int[][] sol(int[][] matrix){
        int[][] res = matrix;
        int m = res.length;
        int n = res[0].length;

        
        
        return res; 
    }
    public static void main(String[] args) {
        int[][] mat = {{1,3,3}, {4,5,6}, {4,3,0}};
        for (int i=0, j=arr.length-1; i<n && j>=0; i++, j--){
            left[i] += arr[i];
            right[i] += arr[j]
        }
    };  
}
