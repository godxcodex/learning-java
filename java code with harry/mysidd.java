import java.util.*;
public class mysidd {
public static void main(String[] args) {
    int [] arr = {1,2,1,1,3};
    Arrays.sort(arr);
    int max = 0;
    int count =1;
    for(int i =1;i<arr.length;i++){
        if(arr[i] == arr[i-1]){
            count++;
        }
        else{
            max = Math.max(max,count);
            count = 1;
        }
    }
    max = Math.max(max,count);
    System.out.println(arr.length-max);
}
    
}
