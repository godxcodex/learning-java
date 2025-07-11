package Array_in_java;
public class video28 {
    public static void main(String[]args){// multidimensional array 
        int[] marks;// A 1-D Array
        int[][]flats ;//A 2-D Array
        flats = new int [2][3];
        flats[0][0]=180;
        flats[0][1]=130;
        flats[0][2]=220;
        flats[1][0]=333;
        flats[1][1]=240;
        flats[1][2]=330;
         //System.out.println(flats.length);
         for(int i = 0;i<flats.length;i++){
            for(int j = 0;j<flats[i].length;j++){
                //System.out.print(i);
                //System.out.println(j);
                System.out.print(flats[i][j]);
                System.out.print(" ");
                
          }
          System.out.println("");
       } 



    }
    
}
