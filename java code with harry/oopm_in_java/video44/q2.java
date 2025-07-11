package oopm_in_java.video44;
class Cylinder1{
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
    public float surfaceArea(){
        return (2*height*radius*(22/7f)) + (2*(22/7f)*radius*radius);
    }
    public float volume(){
        return (22/7f)*radius*radius*height;
    }
}
public class q2{
    public static void main(String[] args) {
        Cylinder1 cylinder = new Cylinder1();
        cylinder.setradi(32);
        cylinder.setheight(33);
        System.out.println(cylinder.getheight());
        System.out.println(cylinder.getradi());
        System.out.println(cylinder.surfaceArea());
        System.out.println(cylinder.volume());
    }
    
}
