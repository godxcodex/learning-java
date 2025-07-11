package oopm_in_java;


class students{
      int studentId;
     String studentName;
        
     void getinfo(){
        System.out.println("my name is" + studentName);
        System.out.println("My id is "+studentId);
    }
}
public class video38part2 {
    public static void main(String[] args) {
        students sidd = new students();
        students shivam = new students();
        shivam.studentName ="shivam kushwaha";
        shivam.studentId = 182;
        System.out.println(shivam.studentName);
        System.out.println(shivam.studentId);
       // shivam.getinfo();
        
    }
    
}
