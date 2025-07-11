package loops_in_java;

public class video24_part1 {//break statement in java for loops...,
        public static void main(String[] args) {
        int b = 0;
        for(int i = 0; i<=7;i++)
    { // for, for loop
            System.out.println(i);
            System.out.println("hi java");
        if(i==2)
        {
        System.out.println("loop end");
        break;
        }
    }
        int a = 0;

        while(a<9)     // for, while loop 
        {
            System.out.println(a);
            System.out.println("hi");
           if(a==5)
           {
            System.out.println("ending of loop");
            break;
           }
            a++;
        }
        System.out.println("while loop ends here!");

        do{ // for do while loop
          System.out.println(b);
          System.out.println("here i am ");
          if(b==2 ){
            System.out.println("do while loop is break ");
            break;
          }
           b++;
        }while(b<10);

        
    }
}
