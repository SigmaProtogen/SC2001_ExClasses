import java.util.Random;
import java.util.Scanner;
import java.util.Arrays;

public class MergsertionSort {

    public static void main(String[] args) {
        int keyComparisons=0;
        Scanner sc = new Scanner(System.in);
        Random rd = new Random();
        System.out.println("Enter array length");
        int arrLength = sc.nextInt();
        int[] arr = new int[arrLength];
        //random array generator
        for(int i=0;i<arr.length;i++){
            arr[i] = rd.nextInt(arrLength);
        }
        System.out.println(Arrays.toString(arr)); //print array

        mergsertion(arr);


    }

    static int S = 10;
    public static void mergsertion(int[] arr){
        //merge+insertion here
    }

    public static void merge(int[] arr, int l, int m, int r){
        int n1 = m - l + 1;
        int n2 = r - m;

        int[] L = new int[n1];
        int[] R = new int[n2];

        for (int i = 0; i < n1; ++i)
            L[i] = arr[l + i];
        for (int j = 0; j < n2; ++j)
            R[j] = arr[m + 1 + j];

        int i = 0, j = 0;
        int k = l;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            } else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }

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

    public static void insertion(int[] arr){
        int n = arr.length;
        for (int i = 1; i < n; ++i) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
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
