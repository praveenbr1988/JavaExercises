package leetcodePractice;

public class ClosestNotoZero {
    public static void main(String[] args) {

        int[] nums = {-4, -1, 4, 8, -2};
        int closest = nums[0];
        for (int i = 0; i < nums.length; i++) {
            if (Math.abs(nums[i]) < Math.abs(closest)) {
                closest = nums[i];
            }
            System.out.println("Iteration :" + i + " " + closest);
        }

        for (int num : nums) {
            if (num == Math.abs(closest)) {
                closest = num;
            }
        }

        System.out.println("Closest No :" + closest);

    }
}
