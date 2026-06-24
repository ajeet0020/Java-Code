
import java.util.Scanner;

// remove element from array and count how times it occurs in the array

public class RemoveElement {
    public static void main(String[] argss) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your size of array ");
        int n = sc.nextInt();
        int arr[] = new int[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int remove = sc.nextInt();
        int count = 0;
        int element = remove;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == remove) {
                count++;
            }
        }

        System.out.println("Element " + element + " occurs " + count + " times in the array.");
    }
}