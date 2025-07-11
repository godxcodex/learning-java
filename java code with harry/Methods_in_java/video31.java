package Methods_in_java;

public class video31 {
    static int logic (int x ,int y){
        int z;
        if(x<y){
            z=x+y;
        }
        else{
            z = (x+y)*5;
        }
        return z;
    }

    public static void main(String[]args){
int a = 4;
int b = 7;
int c = logic(a, b);
 System.out.println(c);
 int a1 = 33;
 int b2 = 4;
 int c1 = logic(a1, b2);
 System.out.println(c1);

    }
    
}
