package practice_set_4;
import java.util.Scanner;
public class q3 {
public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    System.out.println("please enter you income in lakh");
    float income = sc.nextFloat();
    if(income>=2.5 && income<=5.0){
        System.out.println("pay 5% of your income as a tax");
    }
    else if(income>5.0 && income<=10.0)
    {
      System.out.println("pay 20% of your income as a tax");
    }

    else if (income>10.0){
        System.out.println("pay 30% of your income as a tax");
    }
    else{
        System.out.println("you dont need to pay the tax");
    }
}
    
}
