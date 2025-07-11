package Methods_in_java;
import java.util.*;
public class video33part2 {
    static int fo(int n , int...arr){
        int sum = n;
        for(int a:arr){
            sum +=a;
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[k];
        for(int i=0;i<k;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(fo(n,arr));
        sc.close();
    }
    
}
