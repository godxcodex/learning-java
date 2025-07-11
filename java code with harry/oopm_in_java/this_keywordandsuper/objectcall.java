package oopm_in_java.this_keywordandsuper;
class Parent1{
    int salery;
Parent1(){
    this(67);
}
Parent1(int salery){
    this.salery = salery;
}
public void display1(){
    System.out.println("This is salery "+ this.salery);
}
}
public class objectcall {
    public static void main(String[] args) {
        Parent1 pt = new Parent1();
        pt.display1();
    }
}
