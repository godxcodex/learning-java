package oopm_in_java.inheritance;
class Base2{
    Base2(){
    System.out.println("i am base class constructor");
    }
    Base2(int n ){
    System.out.println("hi i am second constructor of base class " + n);
    }
}
class  Derived2 extends Base2{
   Derived2(){
    super(3);
    System.out.println("hi am constructor of Derived class");
   }
    }

public class video46_part2 {
    public static void main(String[] args) {
        Derived2 der = new Derived2();
    }
    
}
