import java.util.Scanner;
public class video15practiceset{
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
     String name = "Siddharth";//Q1 to convert the string into the lower case letter.
     name = name.toLowerCase();
     System.out.println(name);   

    String value = "oshi is a good humanbeing"; //Q2 replace the space with the underscore.
    value = value.replace(" ","_");
    System.out.println(value);

    String letter = "Dear sir ,\n I am <|name|> \n ...........\n........\n thankyou\n <|name|> ";
    letter = letter.replace("<|name|>","Siddharth");
    System.out.println(letter);

    String newname = sc.nextLine();
    System.out.println("Dear sir,\n I am " + newname + "\n.......... thankyou");//Q3 wap where the user just need to input the name in the letter 
    
    //Q4 wap to detect double and triple spaces in the string.
    String fr = "there is  space and    space !";
    
    System.out.println(fr.indexOf("  "));
    System.out.println(fr.indexOf("   "));
    


    }

}