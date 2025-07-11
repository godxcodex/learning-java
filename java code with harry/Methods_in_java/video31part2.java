package Methods_in_java;

public class video31part2 {
int man (int x, int y){
     int z;
    if (x>y){
        z = x+y;
       }
       else{
        z= y-x;
       }
       return z;
    }

    public static void main(String[] args) {

        int a =3;
        int b= 4;
        int c;
        video31part2 obj = new video31part2();
        c = obj.man(a,b);
        System.out.println(c);
        int a1 =33;
        int b1=67;
        int c1 = obj.man(a1, b1);
        System.out.println(c1);
        
    }
    
}
