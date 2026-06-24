
import java.util.Scanner;

public class BinarySearch{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your size of array ");
        int n = sc.nextInt();

        String[] arr = new String[n];

        for(int i = 0; i < arr.length; i++) {
            arr[i] = sc.next();
        }

        String key = sc.next();

        binarSrch(arr, key);
        

    }
    public static void binarSrch(String [] arr, String key) {
        int left = 0;
        int right = arr.length-1;

        while(left <= right) {
        int mid = (left + right) / 2;
        int res = key.compareTo(arr[mid]);
            if(res == 0) {
                System.out.println("Key Found");
                return;
            } else if (res < 0) {
                right = mid + 1;
            } else {
                left = mid - 1;
            }
            
        }
    }
}