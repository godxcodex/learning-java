package Dsa_in_java;
import java.util.Scanner;
public class prefixsum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int [n+1];
        for(int j =1;j<=n;j++){
            arr[j] = sc.nextInt();
        }
        for(int i=2;i<=n;i++){
            arr[i] = arr[i-1] + arr[i];
        }
        for(int k =0;k<=n;k++){
            System.out.print(arr[k] +" ");
        }
        System.out.println();
        int t = sc.nextInt();
        while(t-- >0){
          int l = sc.nextInt();
          int m = sc.nextInt();
          System.out.println(arr[m] - arr[l-1]);
        }
        }
        
        
    }

