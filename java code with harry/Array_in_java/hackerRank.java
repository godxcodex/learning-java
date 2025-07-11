package Array_in_java;
import java.util.Scanner;

public class hackerRank {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        
        if (N >= 1 && N <= 100) {
            if (N % 2 == 0) {
                if (N >= 2 && N <= 5) {
                    System.out.println("Not Weird");
                } 
                else if (N >= 6 && N <= 20) {
                    System.out.println("Weird");
                } 
                else if (N > 20) {
                    System.out.println("Not Weird");
                } 
                else {
                    System.out.println("Invalid output");
                }
            } 
            else { // Odd numbers
                System.out.println("Weird");
            }
        } 
        else {
            System.out.println("Invalid input");
        }
        
    }
}
