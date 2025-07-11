package dynamicArray;
import java.util.*;
public class arr_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        for(int i =0;i<5;i++){
            list.add(sc.nextInt());
        }
        Collections.sort(list);
        System.out.println(list);
        Collections.reverse(list);
        System.out.println(list);

        list.removeIf(n->n%2 ==0 );
        System.out.println(list);
    sc.close();
    
    }
       
    
}
