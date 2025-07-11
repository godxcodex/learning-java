package loops_in_java;

public class video25Q9 {
    public static void main(String[]args){
        int n = 8;
        int sum = 0;
        for(int i=1;i<=10;i++){
            System.out.printf("%d X %d\n",n,i,n*i);
            sum +=n*i;
        }
        System.out.print("The total sum is:");
        System.out.println( sum);
    }
    
}
