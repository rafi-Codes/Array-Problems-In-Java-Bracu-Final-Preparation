import java.util.Scanner;
import java.util.Arrays;

public class codeforces {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int[] arr = {4,0,5,2,1,3};
        for (int i = 0; i < arr.length - 1; i++){
            int minIdx = i;
            for (int j = i + 1; j < arr.length; j++){
                if(arr[j] < arr[minIdx]){
                    minIdx = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[minIdx];
            arr[minIdx] = temp;
        }
        System.out.println(Arrays.toString(arr));
        sc.close();
    }
}

