package Dsa_in_java;

public class secondlargest1 {
    public static void main(String[] args) {
        int[] arr = {23, 44, 55, 67, 89, 89, 40};
        int max1, max2;

        if (arr[0] > arr[1]) {
            max1 = arr[0];
            max2 = arr[1];
        } else {
            max1 = arr[1];
            max2 = arr[0];
        }

        for (int i = 2; i < arr.length; i++) {
            if (arr[i] > max1) {
                max2 = max1;
                max1 = arr[i];
            } else if (arr[i] > max2 && arr[i] != max1) {
                max2 = arr[i];
            }
        }

        System.out.println("Largest: " + max1);
        System.out.println("Second Largest: " + max2);
    }
}
