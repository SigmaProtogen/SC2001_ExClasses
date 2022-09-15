import java.util.Random;
import java.util.Scanner;
import java.util.Arrays;

public class MergsertionSort {

    public static void main(String[] args) {
        int comparisons=0;
        Scanner sc = new Scanner(System.in);
        Random rd = new Random();
        System.out.println("Enter array length");
        int arrLength = sc.nextInt();
        int[] arr = new int[arrLength];
        //random array generator
        for(int i=0;i<arr.length;i++){
            arr[i] = rd.nextInt(arrLength);
        }
        //System.out.println(Arrays.toString(arr)); //print array

        //sort array for merge and ins sorts

    }

    public static void merge(int[] arr, int l, int m, int r){
        // Find sizes of two subarrays to be merged
        int n1 = m - l + 1;
        int n2 = r - m;

        int[] L = new int[n1];
        int[] R = new int[n2];
        /*Copy data to temp arrays*/
        for (int i = 0; i < n1; ++i)
            L[i] = arr[l + i];
        for (int j = 0; j < n2; ++j)
            R[j] = arr[m + 1 + j];
        /* Merge the temp arrays */
        // Initial indexes of first and second subarrays
        int i = 0, j = 0;
        // Initial index of merged subarray array
        int k = l;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            }
            else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }
        /* Copy remaining elements of L[] if any */
        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }
        /* Copy remaining elements of R[] if any */
        while (j < n2) {
            arr[k] = R[j]; j++; k++;
        }
    }

    public static void insertion(){
        //insertion sort here
    }

    public static void sort(){

    }

    public static void printArray(int[] arr, int n)
    {
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.print("\n");
    }
}
