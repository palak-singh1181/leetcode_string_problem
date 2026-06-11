public class insert {
    
    public int searchInsert(int[] nums, int target) {
        int low = 0;
        int high = nums.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return low;
    }

    // main method for local testing
    public static void main(String[] args) {
        insert sol = new insert();

        System.out.println(sol.searchInsert(new int[]{1, 3, 5, 6}, 5)); // 2
        System.out.println(sol.searchInsert(new int[]{1, 3, 5, 6}, 2)); // 1
        System.out.println(sol.searchInsert(new int[]{1, 3, 5, 6}, 7)); // 4
    }
}
