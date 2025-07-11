package loops_in_java;

public class video24_part2 {
    

    public static void main(String[]args){
        int a = 0;
        for(int i = 0;i<=9;i++){
            if(i==4){
                System.out.println("not print for i = 4");
                continue;
            }
            System.out.println(i+"hi");
            
        }
    
  
       while (a<=7){
        if(a==3){
            System.out.println("loop end for i =3");
            a++;
            continue;
            
        }
        System.out.println(a+"yo");
        a++;
    }
    int j = 6;
    do {
        if(j==10){
            System.out.println("not print for j==10");
            j++;
            continue;
        }
        System.out.println(j+"hello");
        j++;
    }while(j<=14);

    }
}
