package oopm_in_java.inheritance;
class Papa{
Papa(){
    System.out.println("hi i am 1st constructor");
}
Papa(int x){
    System.out.println("hi i am "+ x);
}
}
class Bacha extends Papa{
    Bacha(int x, int y){
    super(x);
    System.out.println("i am child bacha of papa class with x :"+x +"and y :"+y );
    
    }
}
public class video46_part4 {
    public static void main(String[] args) {
        Bacha bacha = new Bacha(22, 33);
    }
    
}
