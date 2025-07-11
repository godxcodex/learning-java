package practice_set_4;
import java.util.Scanner;
public class q5 {
    public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    String website = sc.nextLine();
    if(website.endsWith(".com")){
        System.out.println("it is commercial website");
    } 
    else if (website.endsWith(".in")) {
        System.out.println("indian website");
    }    
    else if (website.endsWith(".org")){
        System.out.println("it is organisation website");
    }
    else{
        System.out.println(" i don't know");
    }

    }
}
