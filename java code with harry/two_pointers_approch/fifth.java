package two_pointers_approch;

public class fifth {
    public static void main(String[] args) {
        // Check if the string is a palindrome
        String str = "s";
        int left = 0, right = str.length() - 1;

        boolean isPalindrome = true;
        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                isPalindrome = false;
                break;
            }
            left++;
            right--;
        }

        System.out.println(isPalindrome);
    }
}
