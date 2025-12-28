import java.util.Scanner;
import java.util.Arrays;

public class codeforces {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();

        if (n == 0) {
            System.out.println("[]");
            return;
        }

        int arr[] = new int [n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        k %= arr.length; // avoid unnecessary iteration like if 5 sized array is changed 5 times it becomes same as before.
        while (k--> 0) {
            for (int i = arr.length - 1; i > 0 ; i--) {
                int temp = arr[i];
                arr[i] = arr [i - 1];
                arr[i - 1] = temp;  
            }
        }
        System.out.println(Arrays.toString(arr));
        sc.close();
    }
}
