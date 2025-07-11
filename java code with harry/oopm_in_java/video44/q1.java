package oopm_in_java.video44;
class Cylinder{
    private int radius;
    private int height;
    public void setradi(int newRadi){
      radius = newRadi;   
    }
    public void setheight(int newHeight){
        height = newHeight;
    }
    public int getradi(){
        return radius;
    }
    public int getheight(){
        return height;
    }
}
public class q1 {
    public static void main(String[] args) {
        Cylinder cylinder = new Cylinder();
        cylinder.setradi(32);
        cylinder.setheight(33);
        System.out.println(cylinder.getheight());
        System.out.println(cylinder.getradi());
    }
    
}
