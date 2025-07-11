package oopm_in_java.inheritance;

class Base1 {
    Base1() {
        System.out.println("hi i am base class contructor"); // Constructor in Inheritance
    }
}

class Derived extends Base1 {
    Derived() {
        System.out.println("hi i am constructor of derived class");
    }
}

public class video46 {
    public static void main(String[] args) {
        Derived de = new Derived();// when a derive class is extended from the base class, the constructor of the
                                   // base class
                                   // the constructor of the base class is executed first followed by the
                                   // constructor of the derived class.
    }
}