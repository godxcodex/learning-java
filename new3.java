public class new3 {
    public static void main(String[] args) {
       int [] arr = {1,2,3,4};
       int k = Integer.MIN_VALUE;
       for(int i = 0;i<arr.length;i++){
           int product = 1;
           for(int j =i ; j<arr.length;j++){
              product *= arr[j];
            if(product > k){
                k = product;
            } 
        }
       }
       System.out.println(k);
    }
}
