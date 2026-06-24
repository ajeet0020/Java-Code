
import java.util.Scanner;

public class EvenOddSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       String[] str = sc.nextLine().split("");
       int[] arr = new int[str.length];

       for(int i = 0; i < arr.length; i++) {
        arr[i] = Integer.parseInt(str[i]);
       }
       int even = 0;
       int odd = 0;

       for(int i = 0; i < arr.length; i++) {
        if (arr[i] % 2 == 0) {
            even += arr[i];
        } else {
           odd += arr[i];
        }
       }

       System.out.println("Sum of Even Numbers " + even);
       System.out.println("Sum of Odd Numbers " + odd);
    }
}