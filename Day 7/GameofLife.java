class Solution {
    public boolean isValidNeighbor(int x, int y, int[][] board) {
        return (x >= 0 && x < board.length && y >= 0 && y < board[0].length);
    }

    public void gameOfLife(int[][] board) {
        int[] dx = {0, 0, 1, 1, 1, -1, -1, -1}; // 8 directions for neighbors
        int[] dy = {1, -1, 1, -1, 0, 0, 1, -1};

        for (int row = 0; row < board.length; row++) {
            for (int col = 0; col < board[0].length; col++) {
                int countLiveNeighbors = 0;

                for (int i = 0; i < 8; i++) {
                    int currX = row + dx[i], currY = col + dy[i];
                    if (isValidNeighbor(currX, currY, board) && Math.abs(board[currX][currY]) == 1)
                        countLiveNeighbors++;
                }

                if (board[row][col] == 1 && (countLiveNeighbors < 2 || countLiveNeighbors > 3))
                    board[row][col] = -1;

                if (board[row][col] == 0 && countLiveNeighbors == 3)
                    board[row][col] = 2;
            }
        }

        for (int row = 0; row < board.length; row++) {
            for (int col = 0; col < board[0].length; col++) {
                if (board[row][col] >= 1)
                    board[row][col] = 1;
                else
                    board[row][col] = 0;
            }
        } 
    }
}
