package TwoSum;

public class TwoSum {

    public static int[] twoSums(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] == target - nums[i]) {
                    int[] b = new int[]{i, j};
                    return b;
                }
            }
        }
        throw new IllegalArgumentException("No two sum solution");
    }

}
