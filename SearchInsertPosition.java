public class SearchInsertPosition {
    public static void main(String[] args) {
        int[] nums = {1, 5, 10, 11, 16, 21};

        System.out.println("Position : " + searchInsert(nums, 16));
    }

    public static int searchInsert(int[] nums, int target) {
        int position = 0;
        boolean found = false;
        int start = 0;
        int last = nums.length;

        int mid = (start + last) / 2;

        while (last > start) {
            if (nums[mid] == target) {
                found = true;
                break;
            } else {
                if (target > nums[mid]) {
                    start = mid;
                } else {
                    last = mid;
                }
                mid = (start + last) / 2;
            }
        }

        if (found) {
            return mid;
        } else {
            // element not found
            return position;
        }
    }
}
