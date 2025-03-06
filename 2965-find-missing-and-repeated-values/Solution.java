class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int n = grid.length * grid.length;
        Set<Integer> set = new HashSet<>(n);
        int repeated = 0;
        int sum = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                sum += grid[i][j];
                if (!set.add(grid[i][j])) {
                    repeated = grid[i][j];
                }
            }
        }
        int missing = (((1 + n) * n) / 2) - (sum - repeated);
        return new int[]{repeated, missing};
    }
}