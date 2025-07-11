package oopm_in_java;

class Car {
    private int numberPlate;
    private String name;
    public Car(){
        name ="bmw";
        numberPlate =24367;
    }
    public String getName(){
       return name ;
    }
    public int getNum(){
        return numberPlate;
    }
}
public class video40getter_setter {
    public static void main(String[] args) {
        Car car = new Car();
        System.out.println(car.getName());
        System.out.println(car.getNum());

    }
    
}
