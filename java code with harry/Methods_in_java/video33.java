package Methods_in_java;
public class video33 {
public static int ar(int...arr){//variable argumentation
    int sum=0;
    for(int element:arr){
        sum += element;
    }
    return sum;

}
    public static void main(String[] args) {
        System.out.println(ar(1,2,3,4));
        
    }
}  