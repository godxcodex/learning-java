import java.util.Scanner;
public class marks {
    public static void main(String[]args)
    {
       Scanner sc = new Scanner(System.in);
       System.out.println("enter maths marks");
       float maths = sc.nextFloat();
       System.out.println("enter english marks");
       float english = sc.nextFloat();
       System.out.println("enter hindi marks");
       float hindi = sc.nextFloat();
       float per = ( maths+english+hindi)/3;
System.out.println(per);

    }
}
