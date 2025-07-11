package loops_in_java;
import java.util.Scanner;
public class video25Q5 {//factorial by using for loop
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int fac = 1;
        for(int i=1;i<=n;i++){
            
             fac *=i;//or fac = fac*i;
       }
        System.out.println(fac);
        
    }

}
