package function_in_java;
import java.util.*;
public class int_e {
    public static int sidd(int x , int y){
          int k = x-y;
          return k;
    }
    /*public static void fu( int result ,int a){
         if (result < a){
            System.out.println("yes");
         }
         else{
            System.out.println("no");
         }
    }*/
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
     int a = sc.nextInt();
     int b = sc.nextInt();
     int result1 = sidd(a,b);
     result1 = Math.abs(result1);
     System.out.println(result1);
      double result2 = Math.pow(result1, 3);
      System.out.println(result2);
     //fu(result1,a);
     sc.close();
    }
}
