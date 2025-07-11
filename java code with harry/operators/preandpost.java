package operators;

public class preandpost {
    public static void main(String[] args) {
        int i = 4;
        System.out.println(++i);//pre increment operator first i will assign then inr
        int j = 6;
        int c = ++j;
        System.out.println(c);
        System.out.println(j++);//post increment operator means first 
        System.out.println(j);
        int k = j*3;
        System.out.println(k);
    }
}
