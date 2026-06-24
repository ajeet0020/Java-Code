import java.util.Arrays;
import java.util.Scanner;

// give me java fromat
public class Rotate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your size element of array ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter your K element");
        int k = sc.nextInt();

        rotate(arr, k);
        // System.out.print("[");
        // for (int i = 0; i < arr.length; i++) {
        //     System.out.print(arr[i]);
        //     if (i < arr.length-1) {
        //         System.out.print(", ");
        //     }
        // }
        // System.out.println("]");
        System.out.println(Arrays.toString(arr));
    }

    public static void reverse(int[] arr, int start, int end) {
        while(start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    public static void rotate(int [] arr, int k) {
        int n = arr.length;
        // reverse the entire array 0 to n-1;
        reverse(arr, 0, n-1);
        // reverse the array from 0 to k -1;
        reverse(arr, 0, k-1);
        // reverse the array from k to n-1;
        reverse(arr, k, n-1);
    }
}