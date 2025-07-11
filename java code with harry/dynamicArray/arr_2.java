package dynamicArray;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
public class arr_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String>list = new ArrayList<>();
        for(int i=0;i<5;i++){
            list.add(sc.nextLine());
        }
        System.out.println(list);
        System.out.println(list.get(4));
        System.out.println(list.contains("sidd"));
        Collections.sort(list);
        list.forEach(System.out :: println);
        sc.close();
    }
    
}
