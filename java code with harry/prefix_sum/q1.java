
package prefix_sum;
import java.util.*;
public class q1 {
    public static void main(String[] args) {
       // Scanner sc = new Scanner(System.in);
        
    int [] arr = {1,2,3,4,5};
    int n = arr.length;
    int [] newArr = new int[n];
    newArr[0] = arr[0];
    for(int i=1;i<n;i++){
      newArr[i] = newArr[i-1]+arr[i];
    }
    for(int j =0;j<n;j++){
        System.out.print(newArr[j] +" ");
    }
}

}