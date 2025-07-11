package oopm_in_java.inheritance;
class Base3{
    Base3(){
    System.out.println("i am base class constructor");
    }
    Base3(int n ){
    System.out.println("hi i am second constructor of base class " + n);
    }
}
class  Derived3 extends Base3{
   Derived3(){
    super(3);
    System.out.println("hi am constructor of Derived class");
   }
    }

public class video46_part3 {
    public static void main(String[] args) {
        Derived3 derived3 = new Derived3();
    }
    
}
