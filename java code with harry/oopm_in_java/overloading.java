package oopm_in_java;
public class overloading {
    public static void fo(){
        System.out.println("hi");
    }
    public static void fo(int n){
        System.out.println("hi"+n);
    }
    public static float fo(float k){
         return k*k;
    }
    public static void main(String[] args) {
        fo(20);
        fo();
         float k = fo(2.33f);
         System.out.println(k);
    }

    
}
