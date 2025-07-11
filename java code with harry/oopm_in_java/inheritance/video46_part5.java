package oopm_in_java.inheritance;
class Parent0{
Parent0(){
    System.out.println("hi parent");
}
Parent0(int x){
   System.out.println(x);
}
}
class Child0 extends Parent0{
   Child0(int x, int y){
    super(x);
    System.out.println(x+","+y);
   }
}
class GrandChild0 extends Child0{
GrandChild0 (int x, int y ,int z) {
    super(x, y);
System.out.println(x+","+y+","+z);

}
}
public class video46_part5{
 public static void main(String[] args) {
    GrandChild0 gc0 = new GrandChild0(12, 22, 39);
 }   
}
