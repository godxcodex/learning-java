package Dsa_in_java;
import java.util.Scanner;
public class slidingWindow { // static slidingWindow

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[]arr = new int[n];
        for(int i =0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int first =0;
        for(int j =0;j<m;j++){
            first += arr[j];
        }
        System.out.println(first);
        int sum ;
        for(int k =1;k<=n-m;k++){
            sum = first - arr[k-1]+arr[k+m-1];
            if(sum>first){
                first = sum;
            }
        }
        System.out.println(first);
       sc.close(); 
    }
}