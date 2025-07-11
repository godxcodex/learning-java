package two_pointers_approch;
public class second {
    public static void sortSquares (int[]sar){
        int n = 6;
        int i = n-1;
        int[] arr = new int[n];
        int left =0,right =n-1;
        while(left<=right){
            if(Math.abs(sar[left]) > Math.abs(sar[right])){
                arr[i--] = sar[left]*sar[left];
                left++;
            }
            else{
                arr[i--] = sar[right]*sar[right];
                right--;
            }
        }
        for(int j : arr){
            System.out.print(j +" ");
        }
        
    }
    public static void main(String[] args) {
    int [] sar = {-10,-2,1,3,4,5};
     sortSquares(sar);
}
    
}
