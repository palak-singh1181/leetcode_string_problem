
public class ContainerWater {

    public int maxArea(int[] height) {

        int left = 0;
        int right = height.length - 1;
        int maxArea = 0;

        while (left < right) {

            int width = right - left;
            int h = Math.min(height[left], height[right]);

            maxArea = Math.max(maxArea, width * h);

            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }

        return maxArea;
    }

    public static void main(String[] args) {
        ContainerWater obj = new ContainerWater();

        int[] height = {1, 8, 6, 2, 5, 4, 8, 3, 7};

        System.out.println(obj.maxArea(height));
    }
}