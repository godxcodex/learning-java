import java.util.*;

public class new2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] temp = new int[n];
        int[] arr = new int[n];
        
        // Input elements in the array
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int k = 0; // Counter for temp array index

        // Process the array
        for (int j = 0; j < n; j++) {
            if (arr[j] != 0) {
                temp[k++] = arr[j]; // Store non-zero elements in temp
            }
        }

        // Fill the remaining positions in temp with zeros
        while (k < n) {
            temp[k++] = 0;
        }

        // Print the resulting array
        System.out.println("Resulting array:");
        for (int i = 0; i < n; i++) {
            System.out.print(temp[i] + " ");
        }
    }
}
