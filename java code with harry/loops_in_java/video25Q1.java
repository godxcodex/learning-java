package loops_in_java;
import java.util.Scanner;
public class video25Q1 {
    public static void main(String[] args) {//practice problem 1: print star pattern
        
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        for(int i = a;i >=0;i--){//i-- for decrement 
             for(int j=0;j<i;j++){//j++ for increment of *
                System.out.print("*");
                
             }
            System.out.println();// ln or \n for a new line 
             

        }
    }
    
}
