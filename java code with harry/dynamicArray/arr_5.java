package dynamicArray;
import java.util.*;
public class arr_5 {
    public static void main(String[] args) {
        
        long k = 3L;
        int [] arr = {5,8,6};
        Arrays.sort(arr);
        int j = 0;
        if(k == arr.length){
            j++;
            for(int i =1;i<arr.length;i++){
                if(arr[0] < arr[i]){
                    j++;
                }
            }
        }
       

    }
    
    
}
