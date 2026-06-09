public class median {
    
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        // Ensure nums1 is the smaller array for optimization
        if (nums1.length > nums2.length) {
            return findMedianSortedArrays(nums2, nums1);
        }
        
        int m = nums1.length;
        int n = nums2.length;
        
        int low = 0;
        int high = m;
        
        while (low <= high) {
            // Partition point for nums1
            int partition1 = (low + high) / 2;
            // Partition point for nums2
            int partition2 = (m + n + 1) / 2 - partition1;
            
            // Get border values
            int maxLeft1 = (partition1 == 0) ? Integer.MIN_VALUE : nums1[partition1 - 1];
            int minRight1 = (partition1 == m) ? Integer.MAX_VALUE : nums1[partition1];
            
            int maxLeft2 = (partition2 == 0) ? Integer.MIN_VALUE : nums2[partition2 - 1];
            int minRight2 = (partition2 == n) ? Integer.MAX_VALUE : nums2[partition2];
            
            // Check if we found the correct partition
            if (maxLeft1 <= minRight2 && maxLeft2 <= minRight1) {
                // Odd total elements
                if ((m + n) % 2 == 1) {
                    return Math.max(maxLeft1, maxLeft2);
                }
                // Even total elements
                return (Math.max(maxLeft1, maxLeft2) + Math.min(minRight1, minRight2)) / 2.0;
            }
            else if (maxLeft1 > minRight2) {
                high = partition1 - 1;
            }
            else {
                low = partition1 + 1;
            }
        }
        
        return 0.0;
    }
    
    // Main method to test the solution
    public static void main(String[] args) {
        median m = new median();
        
        // Test Case 1
        int[] nums1 = {1, 3};
        int[] nums2 = {2};
        System.out.println("Test 1: " + m.findMedianSortedArrays(nums1, nums2));
        
        // Test Case 2
        int[] nums3 = {1, 2};
        int[] nums4 = {3, 4};
        System.out.println("Test 2: " + m.findMedianSortedArrays(nums3, nums4));
        
        // Test Case 3
        int[] nums5 = {1, 3, 5, 7, 9};
        int[] nums6 = {2, 4, 6, 8};
        System.out.println("Test 3: " + m.findMedianSortedArrays(nums5, nums6));
    }
}