package practice_set_4;
import java.util.Scanner;
public class video16ifelseif_switch {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter marks of english");
        float english = sc.nextFloat();
        System.out.println("enter marks of maths");
        float maths = sc.nextFloat();
        System.out.println("enter marks of hindi" );
        float hindi = sc.nextFloat();
        float per = (english+maths+hindi)*100/300;
        if(per<33){
            System.out.println("the student is fail");
        
        }
        else if(per<=100 && per>=90){
             System.out.println("out standing performance");
        }
        else if(per>=65 && per<=85){
        System.out.println("perform good");
        }
        else{
            System.out.println("the student is pass");
        }
    }
}
