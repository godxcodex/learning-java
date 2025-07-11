package Methords_practice;
import java.util.Scanner;
public class quest3 { //write a function to print nth term of fibornacci series usig recursionf
    public static int findNumber(int a){
       if(a == 1 || a == 2){
        return a-1;
       }
       
       return findNumber(a-1)+findNumber(a-2);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
            int num = findNumber(n);
            System.out.println(num);
            sc.close();
    }
    
}
