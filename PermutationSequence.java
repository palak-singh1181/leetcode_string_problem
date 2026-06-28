import java.util.*;

public class PermutationSequence {

    public String getPermutation(int n, int k) {

        List<Integer> numbers = new ArrayList<>();
        int[] fact = new int[n + 1];

        fact[0] = 1;
        for (int i = 1; i <= n; i++) {
            fact[i] = fact[i - 1] * i;
            numbers.add(i);
        }

        k--;
        StringBuilder result = new StringBuilder();

        for (int i = n; i >= 1; i--) {
            int index = k / fact[i - 1];
            result.append(numbers.get(index));
            numbers.remove(index);
            k %= fact[i - 1];
        }

        return result.toString();
    }

    public static void main(String[] args) {
        PermutationSequence obj = new PermutationSequence();

        int n = 3;
        int k = 3;

        System.out.println(obj.getPermutation(n, k));
    }
}