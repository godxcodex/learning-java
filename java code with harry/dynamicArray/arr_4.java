package dynamicArray;
import java.util.*;
public class arr_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String>list = new ArrayList<>();
        for(int i =0;i<5;i++){

            list.add(sc.next());
        }
      Collections.sort(list);
      System.out.println(list);

    }
    
    
}
