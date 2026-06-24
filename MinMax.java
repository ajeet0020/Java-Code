
import java.util.Scanner;

public class MinMax {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       String[] str = sc.nextLine().split(" ");
       int [] arr = new int[str.length];

       for(int i = 0; i < arr.length; i++) {
        arr[i] = Integer.parseInt(str[i]);
       }

       String[] str1 = sc.nextLine().split(" ");
       int arr1[] = new int[str1.length];

       for(int i = 0; i < arr1.length; i++) {
        arr1[i] = Integer.parseInt(str1[i]);

       }

        // merged array
        int mergedarr[] = new int[arr.length + arr1.length];
        
        for(int i = 0; i < arr.length; i++) {
            mergedarr[i] = arr[i];
        }

        for(int i = 0; i < arr1.length; i++) {
            mergedarr[arr.length + i] = arr1[i];
        }

        int min = mergedarr[0];
        int max = mergedarr[0];

        for(int i = 0; i < mergedarr.length; i++) {
            if (mergedarr[i] < min) {
                min = mergedarr[i];
            } else if (mergedarr[i] > max) {
                max = mergedarr[i];
            }
        }
        System.out.println("Merged Array " + java.util.Arrays.toString(mergedarr));
        System.out.println("Minimum Number " + min);
        System.out.println("Maximum Number " + max);    
    }
}