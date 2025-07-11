package two_pointers_approch;

public class third {
    public static void main(String[] args) {
        String str = "*<><>*"; // Input string
        int left = 0;
        int right = str.length() - 1;
        int count = 0;

        while (left < right) { // Ensure the loop runs until the pointers meet
            if (str.charAt(left) == '<' && str.charAt(left + 1) == '>') {
                count++;
                left += 2; // Move `left` by 2 to skip the matched pattern
            } else {
                left++; // Move `left` pointer forward if no match
            }
        }

        System.out.println (count);
    }
}
