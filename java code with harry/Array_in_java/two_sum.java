package Array_in_java;

public class two_sum {
    public static void main(String[] args) {
        int[] nums = {2, 3, 4, 2, 5};
        int target = 5;

        int[] result = findTwoSum(nums, target);
        
       
        if (result != null) {
            System.out.printf("Indices: %d, %d\n", result[0], result[1]);
        } else {
            System.out.println("No solution found.");
        }
    }

    public static int[] findTwoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};  
                }
            }
        }
        return null;
    }
}
