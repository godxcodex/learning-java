import java.util.*;
public class new1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int [] temp = new int[x];
        int [] arr = new int[x];
        int j = 0;
        for(int i = 0;i<x;i++){
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        for(int i =1;i<x;i++){
            if(arr[i] == arr[i-1]){
                arr[j] = arr[i];
                j++;
            }
        }
        if(j>0){
        System.out.println(j);
       for(int k = 0;k<j;k++){
         System.out.print(arr[k] +" ");   
       }
    }
    else{
     System.out.println(-1);
    }

    }
}
