package Methords_practice;

import java.util.Scanner;

public class quest2 {
    public static int sum(int n) {
        if (n == 1) {
            return 1;
        } else {
            return n + sum(n - 1);
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int sum = sum(k);
        System.out.println(sum);
        sc.close();
    }

}
