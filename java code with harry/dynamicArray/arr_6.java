package dynamicArray;
import java.util.*;
public class arr_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count0 =0;
        
        int n = sc.nextInt();
        int [] arr = new int[n];
        for(int i =0; i<n;i++){
            arr[i] = sc.nextInt();
            if(arr[i] == 0)
            count0++;
        }
        int index = 0;
        while(index<count0){
            arr[index] = 0;
            index++;
            
        }
        while(index<n){
            arr[index] = 1;
            index++;
        }
       for(int i =0;i<n;i++){
        System.out.print(arr[i]+" ");
       }

        
    }
    
}
