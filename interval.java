import java.util.*;

class interval {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        List<int[]> result = new ArrayList<>();
        int i = 0, n = intervals.length;

        while (i < n && intervals[i][1] < newInterval[0]) {
            result.add(intervals[i]);
            i++;
        }

        while (i < n && intervals[i][0] <= newInterval[1]) {
            newInterval[0] = Math.min(newInterval[0], intervals[i][0]);
            newInterval[1] = Math.max(newInterval[1], intervals[i][1]);
            i++;
        }
        result.add(newInterval);

        while (i < n) {
            result.add(intervals[i]);
            i++;
        }

        return result.toArray(new int[result.size()][]);
    }

    public static void main(String[] args) {
        interval sol = new interval();

        int[][] res1 = sol.insert(new int[][]{{1,3},{6,9}}, new int[]{2,5});
        System.out.println(Arrays.deepToString(res1)); // [[1,5],[6,9]]

        int[][] res2 = sol.insert(new int[][]{{1,2},{3,5},{6,7},{8,10},{12,16}}, new int[]{4,8});
        System.out.println(Arrays.deepToString(res2)); // [[1,2],[3,10],[12,16]]
    }
}
