package oopm_in_java;

import practice_set_4.sidd;

class Emp1{
   private String name ;
   private int age ;
   public Emp1(){
    age = 22;
    name = "do it you self";
   }
   public Emp1(String myName,int myAge){
    name = myName;
    age = myAge;
    
   }
   public Emp1(String hiName){
    age = 2;
    name = hiName; 
   }
   public String getname(){
     return name;
   }
   public void setname(String n){
     name = n;
   }
   public int getage(){
    return age;
   }
   
}
public class video42_construc {
    public static void main(String[] args) {
        
       // Emp1 emp = new Emp1();
       // System.out.println(emp.getname());
       // Emp1 sidd = new Emp1("sidd",45);
        Emp1 emp1 = new Emp1("siddharth");
        System.out.println(emp1.getname());
        System.out.println(emp1.getage());
       
        
    }
}
