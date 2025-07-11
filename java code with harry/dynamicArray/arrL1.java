package dynamicArray;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Iterator;
public class arrL1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       
        /*  ArrayList<Integer> list = new ArrayList<>();
        int t = sc.nextInt();
        for(int i =0;i<t;i++){
            list.add(sc.nextInt());
            }
        for(int value : list){
            System.out.print(value +" ");
        
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(20);
        list1.add(30);
        list1.add(40);
        list1.add(30);
        System.out.println(list1);
       System.out.println(list1.size()); 
       //list1.removeIf(num -> num == 30); // OR
       Iterator<Integer> na =  list1.iterator();
       while(na.hasNext()){
        if(na.next() == 30){
            na.remove();
        }
    }
    System.out.println(list1);*/
    int n =sc.nextInt();
    int j =0,k=n-1;
    int temp;
    ArrayList<Integer> list2 = new ArrayList<>();
       for(int i=0;i<n;i++){
       list2.add(sc.nextInt());
       }
        while (j<k) {
         temp = list2.get(j);
         list2.set(j,list2.get(k));
         list2.set(k,temp);
         j++;
         k--;
         
        }
        System.out.println(list2);
    }
}
