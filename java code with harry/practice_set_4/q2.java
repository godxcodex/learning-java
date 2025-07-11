package practice_set_4;
import java.util.Scanner;
public class q2 {
public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    int year = sc.nextInt();
    if(year%4==0 || year%40==0)
    {
        System.out.println("year is leap year");
    }
    else{
        System.out.println("not an leap year");
    }
}
    
}
