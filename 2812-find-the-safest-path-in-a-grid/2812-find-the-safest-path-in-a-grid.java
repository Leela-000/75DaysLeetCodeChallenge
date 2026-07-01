class Solution {
    private static final int[][] DIRS = {{1,0},{-1,0},{0,1},{0,-1}};
    public int maximumSafenessFactor(List<List<Integer>> grid) {
         int n = grid.size();
        int[][] dist = new int[n][n];
        for (int[] row : dist) Arrays.fill(row, Integer.MAX_VALUE);

        // Step 1: Multi-source BFS from all thief cells
        Queue<int[]> q = new ArrayDeque<>();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (grid.get(i).get(j) == 1) { // thief cell
                    dist[i][j] = 0;
                    q.offer(new int[]{i, j});
                }
            }
        }

        while (!q.isEmpty()) {
            int[] cur = q.poll();
            for (int[] d : DIRS) {
                int ni = cur[0] + d[0], nj = cur[1] + d[1];
                if (ni >= 0 && nj >= 0 && ni < n && nj < n) {
                    if (dist[ni][nj] > dist[cur[0]][cur[1]] + 1) {
                        dist[ni][nj] = dist[cur[0]][cur[1]] + 1;
                        q.offer(new int[]{ni, nj});
                    }
                }
            }
        }

        // Step 2: Binary search for maximum safeness factor
        int low = 0, high = n * n, ans = 0;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (canReach(dist, mid)) {
                ans = mid;
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return ans;
    }

    // BFS to check if path exists with safeness >= minSafe
    private boolean canReach(int[][] dist, int minSafe) {
        int n = dist.length;
        if (dist[0][0] < minSafe) return false;

        boolean[][] visited = new boolean[n][n];
        Queue<int[]> q = new ArrayDeque<>();
        q.offer(new int[]{0, 0});
        visited[0][0] = true;

        while (!q.isEmpty()) {
            int[] cur = q.poll();
            if (cur[0] == n - 1 && cur[1] == n - 1) return true;

            for (int[] d : DIRS) {
                int ni = cur[0] + d[0], nj = cur[1] + d[1];
                if (ni >= 0 && nj >= 0 && ni < n && nj < n &&
                    !visited[ni][nj] && dist[ni][nj] >= minSafe) {
                    visited[ni][nj] = true;
                    q.offer(new int[]{ni, nj});
                }
            }
        }
        return false;
    }
}

   