package Methods_in_java;

public class video32part3 {
    //Methods Overloading
    static void foo(){
        System.out.println("good morning  bro!");

    }
    static void foo(int a){
        System.out.println("good morning "+a+" bro!");

    }
    static void foo(int a,int b){
        System.out.println("good morning "+a+" bro!");
        System.out.println("good night "+b+" bro!");
    }
    public static float fo(float n ){
        return n/2;
    }
    
    public static void main(String[]args){
     foo();
     foo(2000);
     foo(3000,4000);
     float k = fo(200);
     System.out.println(k);
     float j = (float)22/3;
     System.out.println(j); 

    }
    
}
    
    
    
