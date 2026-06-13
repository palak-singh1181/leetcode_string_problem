import java.util.*;

class comb {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        backtrack(candidates, target, 0, new ArrayList<>(), 0, result);
        return result;
    }

    private void backtrack(int[] candidates, int target, int start, List<Integer> current, int currentSum, List<List<Integer>> result) {
        if (currentSum == target) {
            result.add(new ArrayList<>(current));
            return;
        }
        if (currentSum > target) {
            return;
        }
        for (int i = start; i < candidates.length; i++) {
            current.add(candidates[i]);
            backtrack(candidates, target, i, current, currentSum + candidates[i], result);
            current.remove(current.size() - 1);
        }
    }

    public static void main(String[] args) {
        comb sol = new comb();
        int[] candidates = {2, 3, 6, 7};
        int target = 7;
        System.out.println(sol.combinationSum(candidates, target));
    }
}
