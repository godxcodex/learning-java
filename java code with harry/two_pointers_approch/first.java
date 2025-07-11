package two_pointers_approch;

public class first {
    public static void main(String[] args) {
        int [] arr = {0,1,3,4,5,8,9};
        int n = arr.length;
        int left =0,right = n-1;
        int temp;
        while(left < right){
            if(arr[left] %2 !=1 && arr[right]%2 != 0){
                temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp ;
                left ++;
                right--;
            }
            if(arr[left]%2 == 1 ){
                left++;
            }
            if(arr[right] %2 == 0){
                right--;
            }
           
        }
        for(int i : arr){
            System.out.print(i +" ");
        }
    }
    
}
