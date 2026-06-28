import java.util.*;

class Solution {

    class Pair {
        int x, y;

        Pair(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    public int orangesRotting(int[][] grid) {

        Queue<Pair> q = new LinkedList<>();
        int fresh = 0;

        // Add all rotten oranges to queue and count fresh oranges
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == 2) {
                    q.offer(new Pair(i, j));
                } else if (grid[i][j] == 1) {
                    fresh++;
                }
            }
        }

        // No fresh oranges
        if (fresh == 0)
            return 0;

        int[] dx = {-1, 0, 1, 0};
        int[] dy = {0, 1, 0, -1};

        int minutes = 0;

        while (!q.isEmpty() && fresh > 0) {

            int size = q.size();

            for (int k = 0; k < size; k++) {

                Pair curr = q.poll();

                for (int i = 0; i < 4; i++) {

                    int nx = curr.x + dx[i];
                    int ny = curr.y + dy[i];

                    if (nx >= 0 && ny >= 0 &&
                        nx < grid.length && ny < grid[0].length &&
                        grid[nx][ny] == 1) {

                        grid[nx][ny] = 2;
                        fresh--;

                        q.offer(new Pair(nx, ny));
                    }
                }
            }

            minutes++;
        }

        return fresh == 0 ? minutes : -1;
    }
}