package loops_in_java;
import java.util.Scanner;
public class video25Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=1;i<=10;i--){
           // System.out.println(i*n);
            System.out.printf("%d X %d = %d\n",n,i,n*i);
          
        }
    }
    
}
