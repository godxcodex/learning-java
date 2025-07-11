package Array_in_java;
public class video29_practice_set6 {
    public static void main(String[]args){
      float sum=0;
      float[] marks ={2.88f,5.89f,6.884f,3.55f};//Q1 create a array of float and claculate sum of all the element of array 
        for(int i =0;i<marks.length;i++){
            sum +=marks[i];
        }
        System.out.println(sum);
        //Q2 WAP to find out whether a given integer is present in an array or not 
        int n =75;//Q2
       int[] num ={23,34,78,65,54,90,70};
       boolean found = false;
        for(int i =0;i<num.length;i++){
            if(n==num[i]){
                System.out.print("element is found at index:");
              System.out.println(i);
              found = true;
              break;
              
            }
           
        }
         
          if(!found){
            System.out.println("element is not present in the Array");
          }   
          
        //Q3 Calculate the average marks from an array contaning marks of all student in a physics .Using for-each loop.
        int [] numer={23,44,56,66,78,89};
        int add = 0;
        for(int element:numer){
          add +=element;
        }    
        System.out.println(add/numer.length);    
        

                 //OR
        int []d ={34,55,66,76};
        int s = 0;
        for (int i = 0;i<d.length;i++){
          s+=d[i];

        } 
        int a = d.length;
        float b =(float) s/a;
        System.out.println(b);


        //Q4 write an program to addition of two 2X3 matrix in java.
        int [][] mat1={{1,2,3},
                         {4,5,6}};
        int [][] mat2 ={ {7,8,9},
                         {10,11,12}};
        int [][]result = {{0,0,0},
                            {0,0,0}};
          for (int i =0;i<mat1.length;i++ ){//row no of times
            for(int j=0;j<mat1[i].length;j++){//column no. of time
              result[i][j]=mat1[i][j]+mat2[i][j];
               //System.out.printf("i = %d andj = %d\n",i,j); 
              System.out.print(result[i][j]+" ");

            }
            System.out.println();
          }


        
        //Q5 WAP to reverse an array note:not only print thr reverse array ;
        
        int[] array ={1,2,3,4,5,6};
        int l = array.length;
        int c = Math.floorDiv(l,2);
        int temp;
        for(int m=0;m<c;m++){
            temp = array[m];
            array[m] = array[l-m-1];
            array[l-m-1] = temp;

        }
        for(int element:array){
        System.out.print(element +" ");
        }
             System.out.println();
        //Q6 find the largest no. in array 
        int [] arr={1,33,44,66,83,24};
        int max = 0;
        for(int element:arr){
          if(element>max){
            max = element;
          }
        }
        System.out.println(max);
        
               //OR

        int[] ab = {22,33,45,78,40};
        int maxi =ab[0];
        for(int g =0;g<ab.length;g++){
        if(ab[g]>maxi){
           maxi = ab[g];
        }
      }
System.out.println(maxi);

       //Q7 find the smallest no. in the array
       int[]oshi ={22,-2,1,33,67,78};
        int smaller =oshi[0];
     
       for(int fg =0;fg<oshi.length;fg++){
          if(oshi[fg]<smaller){
            smaller = oshi[fg];
          }
         
    }
    System.out.println(smaller);
        //Q8  WAP to find whether the array is sorted or not 
        boolean isSorted = true;
        int [] ar={22,23,25,45};
        for(int i = 0; i<ar.length-1;i++){
          if(ar[i]>ar[i+1]){
            isSorted = false;
            break;
          
          }
          
        }
       if(isSorted !=false){
        System.out.println("the array is sorted");
            
       } 
       else{
        System.out.println("array is not  sorted ");
       }
 
      }

}
            
            
        
            
    
  



  
