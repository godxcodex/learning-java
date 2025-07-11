package oopm_in_java.inheritance;
class Parent{
    private int age;
    public void setAge(int x){
       age = x;
    }
    public int getAge(){
        return age;
    }

}
class Child extends Parent{
private long mobileNo;
 public void setNo(long n){
  mobileNo = n;
 }
 public long getNo(){
    return mobileNo;
 }
}
public class video45{
    public static void main(String[] args) {
     Parent parent = new Parent(); 
    parent.setAge(4);
    System.out.println(parent.getAge());
    Child child = new Child();
    child.setAge(23);
    System.out.println(child.getAge());
    child.setNo(8109104391l);
    System.out.println(child.getNo());
    }  
}