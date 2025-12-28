import java.util.Scanner;
import java.util.Arrays;

public class codeforces {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int largest = 0;
        int secLargest = 0;
        int thirdLargest = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > arr[largest]) {
                thirdLargest = secLargest;
                secLargest = largest;
                largest = i;   
            }  
            else if (arr[i] > arr[secLargest]) {
                thirdLargest = secLargest;  
                secLargest = i;
            }
            else if (arr[i] > arr[thirdLargest]) {
                thirdLargest = i;
            }
        }

        System.out.println(arr[thirdLargest]);

        sc.close();
    }
}
