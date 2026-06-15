 
    
import java.util.Arrays;

public class Element {

    public int[] searchRange(int[] nums, int target) {
        int[] result = {-1, -1};

        int left = 0, right = nums.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] == target) {
                result[0] = mid;
                right = mid - 1;
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        left = 0;
        right = nums.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] == target) {
                result[1] = mid;
                left = mid + 1;
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        Element obj = new Element();

        int[] nums = {5, 7, 7, 8, 8, 10};
        int target = 8;

        System.out.println(Arrays.toString(obj.searchRange(nums, target)));
    }
}