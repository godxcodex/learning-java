package oopm_in_java.this_keywordandsuper;
class Student{
    int age;
void setAge(int age){
    this.age = age;
}
    void printAge(){
        System.out.println("my age is " + this.age);
    }
}
public class samename {
    public static void main(String[] args) {
        Student st = new Student();
        st.setAge(45);
        st.printAge();
        //OR
        st.setAge(44);
        st.printAge();
    }
}
