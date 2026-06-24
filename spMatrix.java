class spMatrix {
    public int[][] generateMatrix(int n) {
        int[][] matrix = new int[n][n];
        int top = 0, bottom = n - 1, left = 0, right = n - 1;
        int num = 1;

        while (top <= bottom && left <= right) {
            for (int i = left; i <= right; i++)
                matrix[top][i] = num++;
            top++;

            for (int i = top; i <= bottom; i++)
                matrix[i][right] = num++;
            right--;

            if (top <= bottom) {
                for (int i = right; i >= left; i--)
                    matrix[bottom][i] = num++;
                bottom--;
            }

            if (left <= right) {
                for (int i = bottom; i >= top; i--)
                    matrix[i][left] = num++;
                left++;
            }
        }

        return matrix;
    }

    public static void main(String[] args) {
        spMatrix sol = new spMatrix();

        int[][] res = sol.generateMatrix(3);
        for (int[] row : res) {
            System.out.println(java.util.Arrays.toString(row));
        }
        // [1, 2, 3]
        // [8, 9, 4]
        // [7, 6, 5]
    }
}
