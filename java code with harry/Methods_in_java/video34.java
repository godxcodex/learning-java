package Methods_in_java;

public class video34 {//R E C U R S I O N 
    
    static int fact( int n){
        if(n==0||n==1){
            return 1;
        }
        else{
            return n*fact(n-1);
        }
    }

    public static void main(String[] args) {
         int n = 3;
        System.out.println(fact(n));
    }
}
