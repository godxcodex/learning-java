package Array_in_java;

public class video26array {
public static void main(String[] args) {
  // class room of 500 student  - you have to store the marks odf 500 students 
  /* you have to options :
      1.Create 500 variables 
      2.Use Arrays(Recommended)
   */
   int[] marks = new int[5];
   marks[0]=100;
   marks[1]=20;
   marks[2]=90;
   marks[3]=70;
   marks[4]=65;
   //marks[5]=33; throws an error because the size of array is = 5 but (n-1) so it can not possible to use it 
System.out.println(marks[3]);//not put 5 or other no. grater than array size in the place of 3  


}
    

    
}
