import java.util.Scanner;
public class video14strings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String value = sc.nextLine();
        String name = value.trim();//remove unwanted spaces 
        System.out.println(name);
        System.out.println();
        System.out.println(name.toUpperCase());//convert all lower case letter into upper case letter 
        System.out.println(name.substring(2));
        System.out.println(name.substring(1,4));
        System.out.println(name.replace('d','h'));//replace the d with h in the string which is enter by the user    
       // char b = 'c';
      //ystem.out.println(b);
    
}
}
