import java.util.*;

class Solution {

    int[] dx = {-1, 0, 1, 0};
    int[] dy = {0, 1, 0, -1};

    private void bfs(char[][] board, int row, int col) {
        int n = board.length;
        int m = board[0].length;

        Queue<int[]> q = new LinkedList<>();
        q.offer(new int[]{row, col});
        board[row][col] = 'T'; // Mark as safe

        while (!q.isEmpty()) {
            int[] curr = q.poll();

            for (int i = 0; i < 4; i++) {
                int nx = curr[0] + dx[i];
                int ny = curr[1] + dy[i];

                if (nx >= 0 && ny >= 0 && nx < n && ny < m && board[nx][ny] == 'O') {
                    board[nx][ny] = 'T';
                    q.offer(new int[]{nx, ny});
                }
            }
        }
    }

    public void solve(char[][] board) {

        int n = board.length;
        int m = board[0].length;

        // Traverse first and last column
        for (int i = 0; i < n; i++) {
            if (board[i][0] == 'O')
                bfs(board, i, 0);

            if (board[i][m - 1] == 'O')
                bfs(board, i, m - 1);
        }

        // Traverse first and last row
        for (int j = 0; j < m; j++) {
            if (board[0][j] == 'O')
                bfs(board, 0, j);

            if (board[n - 1][j] == 'O')
                bfs(board, n - 1, j);
        }

        // Flip surrounded regions and restore safe regions
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {

                if (board[i][j] == 'O')
                    board[i][j] = 'X';

                else if (board[i][j] == 'T')
                    board[i][j] = 'O';
            }
        }
    }
}