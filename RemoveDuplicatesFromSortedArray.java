import java.util.Arrays;

public class RemoveDuplicatesFromSortedArray {
    public static void main(String[] args) {
        int[] nums = {2, 2, 3, 4, 5, 5, 7, 8, 8};

        int result = removeDuplicates(nums);
        System.out.println("Length : " + result);
    }

    public static int removeDuplicates(int[] nums) {
        int[] tmp = new int[nums.length];
        int j = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] != nums[i + 1]) {
                tmp[j] = nums[i];
                j++;
            }
        }
        System.out.println(Arrays.toString(tmp));

        return j;
    }
}
