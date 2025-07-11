package oopm_in_java.this_keywordandsuper;
class Parent{
    String name;
Parent(String name){
this.name = name;

 }
 public void getName(){
    System.out.println("Parent name is "+this.name);
 }
}
public class samename2 {
    public static void main(String[] args) {
        
        Parent par = new Parent("siddhart");
        par.getName();
    }
    
}
