import java.util.Scanner;
public class video12Q4 {
    
    public static void main (String[]args)
    {
      Scanner sc =new Scanner(System.in);
      System.out.println("Enter the value of v");
      float v = sc.nextFloat();
      System.out.println("Enter the value of u");
      float u = sc.nextFloat();
      System.out.println("Enter the value of a");
      float a = sc.nextFloat();
      System.out.println("Enter the value of s");
      float s =sc.nextFloat();
      System.out.println((v*v-u*u)/(2*a*s));
    }
}
