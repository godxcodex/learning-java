package function_in_java;
import java.util.*;
public class friend {
    public static void leftshift (int[]arr, int k, int n){
       if (n == 0)
              return;
              k = k % n;
     if(k>n)
        return;
            int[] temp = new int[k];
            for(int i = n-k; i < n; i++){
                temp[i-n+k] = arr[i];
            }
            for(int i = n-k-1; i >= 0; i--){
                arr[i+k] = arr[i];
            }
            for(int i = 0; i < k; i++){
                arr[i] = temp[i];
            }
       

       
    }
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int n = 7;
        int[]arr = {1,2,3,4,5,6,7};
        int k = sc.nextInt();
        int b = arr.length;
        leftshift(arr, k, n);
        for(int i = 0; i < b; i++){
            System.out.print(arr[i] + " ");
        }
        
        
    }
    
}
