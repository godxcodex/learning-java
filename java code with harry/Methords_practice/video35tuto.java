package Methords_practice;
import java.util.Scanner;
public class video35tuto {

    public static void table(int a){
        for(int i=1;i<=10;i++){
        System.out.println(a + "X" + i + "=" + a*i );
    }
}
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        table(n);
        sc.close();
    }
    
}
