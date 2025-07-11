package oopm_in_java.this_keywordandsuper;
class Parent2{
    void display1(){
        System.out.println( "hi i am display 1");
    }
    void display2(){
        System.out.println("hi i am display 2");
        this.display1();
    }
}
public class method_in_method {
    public static void main(String[] args) {
        Parent2 pt = new Parent2();
        pt.display2();
    }
}
