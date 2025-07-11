package Array_in_java;
public class video27 {
    public static void main(String[] args) {
        int[] marks = {26, 23, 35, 55, 61, 84};
        // Loop condition should be i < marks.length
        System.out.println(marks.length);
        for (int i = 0; i < marks.length; i++) {
            System.out.println(marks[i]);
        }

        String[] family = {"Sidd", "Oshi", "Suman", "Deepak", "Asha"};
        int n = family.length;
        System.out.println(n);
        
        // Loop condition should be k < n
        for (int k =0; k < n ; k++) {
            System.out.println(family[k]);
        }
    }
}
