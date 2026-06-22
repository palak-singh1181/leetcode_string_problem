import java.util.*;

class merge {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);

        List<int[]> result = new ArrayList<>();
        result.add(intervals[0]);

        for (int i = 1; i < intervals.length; i++) {
            int[] last = result.get(result.size() - 1);
            int[] curr = intervals[i];

            if (curr[0] <= last[1]) {
                last[1] = Math.max(last[1], curr[1]);
            } else {
                result.add(curr);
            }
        }

        return result.toArray(new int[result.size()][]);
    }

    public static void main(String[] args) {
        merge sol = new merge();

        int[][] res1 = sol.merge(new int[][]{{1,3},{2,6},{8,10},{15,18}});
        System.out.println(Arrays.deepToString(res1)); // [[1,6],[8,10],[15,18]]

        int[][] res2 = sol.merge(new int[][]{{1,4},{4,5}});
        System.out.println(Arrays.deepToString(res2)); // [[1,5]]
    }
}
