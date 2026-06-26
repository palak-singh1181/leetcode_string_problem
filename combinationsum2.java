
import java.util.*;

class combinationsum2 {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(candidates);
        backtrack(candidates, target, 0, new ArrayList<>(), result);
        return result;
    }

    private void backtrack(int[] candidates, int target, int start, List<Integer> current, List<List<Integer>> result) {
        if (target == 0) {
            result.add(new ArrayList<>(current));
            return;
        }

        for (int i = start; i < candidates.length; i++) {
            if (i > start && candidates[i] == candidates[i - 1]) continue;
            if (candidates[i] > target) break;

            current.add(candidates[i]);
            backtrack(candidates, target - candidates[i], i + 1, current, result);
            current.remove(current.size() - 1);
        }
    }

    public static void main(String[] args) {
        combinationsum2 sol = new combinationsum2();

        System.out.println(sol.combinationSum2(new int[]{10,1,2,7,6,1,5}, 8));
        // [[1,1,6],[1,2,5],[1,7],[2,6]]

        System.out.println(sol.combinationSum2(new int[]{2,5,2,1,2}, 5));
        // [[1,2,2],[5]]
    }
}