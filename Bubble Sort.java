import java.util.Scanner;
import java.util.Arrays;

public class codeforces {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int[] arr = {4,0,5,2,1,3};
        for (int i = 0; i < arr.length - 1; i++){
            boolean swaped = false;
            for (int j = 0; j < arr.length - i - 1; j++){
                if(arr[j] > arr[j + 1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swaped = true;
                }
            }
            if (!swaped){
                break;
            }
        }
        System.out.println(Arrays.toString(arr));
        sc.close();
    }
}
