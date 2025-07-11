package oopm_in_java;

class empl {
    int id;
    int salary;
    String name;

    public String getname() {
        return name;
    }

    public void setname(String n) {
        name = n;
    }
}

class square {
    int side;

    public int area() {
        return side*side;
    }

    public int para() {
        return 4 * side;
    }
}

public class video39 {
    public static void main(String[] args) {
        // Create an object of `empl`
        empl getn = new empl();
        getn.id = 12;
        getn.salary = 200;
        getn.setname("siddharth jain");
        System.out.println(getn.getname());

        // Create an object of `square`
        square shape = new square();
        // Example value for testing
       shape.side = 100 ;
       System.out.println(shape.area());
       System.out.println(shape.para());
    }
}
