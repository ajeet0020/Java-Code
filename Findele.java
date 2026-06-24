
import java.util.Arrays;

public class Findele {
    public static void main(String[] args) {
        int[] arr =  {8,7,6,4,1};

        int findMul = 36;
        FindMulRes(arr, findMul);
    }

    public static void FindMulRes(int [] arr, int findMul) {
        Arrays.sort(arr);
        int start = 0;
        int end = arr.length-1;
        boolean found = false;

        while(start < end) {
            int mul = arr[start] * arr[end];

            if(mul == findMul) {
                System.out.println(arr[start] + " " + arr[end]);
                found = true;
                break;
            } else if (mul > findMul) {
                end--;
            } else {
                start++;
            }
        }

        if (!found) {
            System.out.print("No Pair found");
        }

    }
}
