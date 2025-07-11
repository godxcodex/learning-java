package oopm_in_java;
class Employee{ 
 int id ;
 String name;
}

public class video38My_firstclass {
    public static void main(String[] args) {
        Employee sidd = new Employee(); // Instantiating a new Employee Object
        // Setting a attribute or properties
        sidd.id = 25;
        sidd.name = "Siddharth jain";
        System.out.println(sidd.name);
        System.out.println(sidd.id);
        
    }
}
