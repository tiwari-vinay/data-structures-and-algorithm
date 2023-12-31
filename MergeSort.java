/**
 * MergeSort
 */

class Sorting{

    void merge_sort(int[] arr, int l, int h){
        if(l<h)
        {
            int mid = (l+h)/2;
            merge_sort(arr, l, mid);
            merge_sort(arr,mid+1, h);
            merge(arr,l,mid, h);
        }
    }

    void merge(int[] arr, int l, int m, int h){
        int n1 = m-l+1;
        int n2 = h-m;
        int A[] = new int[n1];
        int B[] = new int[n2];
        for(int i=0; i<n1; i++)
            A[i] = arr[i+l];
        for(int i=0; i<n2; i++)
            B[i] = arr[i+m+1];

        int i = 0, j = 0, k = l;

        while (i<n1 && j<n2){
            if(A[i] <= B[j]){
                arr[k] = A[i];
                i++; k++;
            }
            else{
                arr[k] = B[j];
                j++; k++;
            }
        }

        while(i<n1){
            arr[k] = A[i];
            i++; k++;
        }
        while(j<n2){
            arr[k] = B[j];
            j++; k++;
        }
    }

    void insertion_sort(int[] arr){
        int n = arr.length;
        for (int i=1; i<n; i++){
            int j = i-1;int key = arr[i];
            while(j>=0 && arr[j]>key){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = key;
        }
    }
}

public class MergeSort {

    public static void main(String[] args) {
        int[] arr = {5,5,5,3,2,6,7,8};
        Sorting s = new Sorting();
        // s.merge_sort(arr, 0, arr.length-1);
        s.insertion_sort(arr);
        for (int e : arr)
            System.out.print(e + " ");
    }
}