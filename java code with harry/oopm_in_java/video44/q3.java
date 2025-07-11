package oopm_in_java.video44;
class Cylinder2{
    private int height;
    private int radius;
    public Cylinder2(int height,int radius){
     this.height = height;
     this.radius = radius;
    }
    public float  sa(){ 
        return (2*height*radius*(22/7f)) + (2*(22/7f)*radius*radius);
    }
    public float vol(){
        return (22/7f)*radius*radius*height ;
    }
}
public class q3 {
public static void main(String[] args) {
    Cylinder2 cylinder = new Cylinder2(33,32);
    System.out.println(cylinder.sa());
    System.out.println(cylinder.vol());
}
}
