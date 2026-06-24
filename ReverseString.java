// reverse a string like i am learn java  to a va jnrea lm i without remove space 
import java.util.Scanner;
 public class ReverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your String ");
        String str = sc.nextLine();
// char arr banana hai 
        char[] arr = str.toCharArray();
        String rev = "";
        for(int i = str.length() - 1; i >= 0; i--) {
            rev += str.charAt(i);
        }
        System.out.println(rev);
    }
}