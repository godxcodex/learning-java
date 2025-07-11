package two_pointers_approch;

public class fourt {
    
    public static void main(String[] args) {
        int[]arr = {1,2,3,4,5,6,7};
           sidd(arr);
    }
    public static void sidd(int [] arr){
        int target =8;
        int left = 0;
        int right = arr.length-1;
        while (left<right) {
            int sum = arr[left]+arr[right]; 
            if(sum == target){
             System.out.println(arr[left]+" "+arr[right]);
             return;
            }
            else if(sum>target){
                right--;
            }
            else{
                left++;
            }
            
        }
        System.out.println("not found");
    }
    
}
