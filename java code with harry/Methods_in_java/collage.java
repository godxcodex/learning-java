package Methods_in_java;
public class collage {

    public static int arr(int[]array){
        int j = 1;
        for(int i=1;i<array.length;i++){
            if(array[i] != array[i-1]){
                array[j] = array[i];
                j++;
            }
        }
      return j;   
    }
    public static void main(String[] args) {
        int[]arry = {1,1,1,2,2,2,3,3,4,4,5};
        int k = arr(arry);
       for(int i =0;i<k;i++){
        System.out.print(arry[i]+" ");
       }
    }
}