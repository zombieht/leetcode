/**
 * Created by zombie on 2017/7/24.
 */
public class TwoSum {

    public static void main(String[] args) {
        TwoSum a = new TwoSum();
        int[] b = a.twoSums(new int[]{2, 3, 4, 5}, 8);
        System.out.println(b[0] + " " + b[1]);
    }

    public int[] twoSums(int[] nums, int target) {
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
