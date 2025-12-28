import java.util.Scanner;
import java.util.Arrays;

public class codeforces {
    public static void reverse (int[] arr, int start, int end){
        while (start < end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int k = sc.nextInt();

        for (int i = 0; i < arr.length; i+=k){
            reverse(arr, i, Math.min(i + k - 1, arr.length - 1));
        }
         
        System.out.println(Arrays.toString(arr));

        sc.close();
    }
}
