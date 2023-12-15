class Solution {
    public void gameOfLife(int[][] board) {
    int rows = board.length;
    int cols = board[0].length;

    // Créer une copie du tableau original pour référencer l'état précédent
    int[][] copyBoard = new int[rows][cols];
    for (int row = 0; row < rows; row++) {
        for (int col = 0; col < cols; col++) {
            copyBoard[row][col] = board[row][col];
        }
    }


    // Directions pour les 8 voisins
    int[][] directions = {{-1, -1}, {-1, 0}, {-1, 1}, {0, -1}, {0, 1}, {1, -1}, {1, 0}, {1, 1}};

    // Parcourir chaque cellule du tableau
    for (int row = 0; row < rows; row++) {
        for (int col = 0; col < cols; col++) {

            // Compter les voisins vivants
            int liveNeighbors = 0;
            for (int[] direction : directions) {
                int r = row + direction[0];
                int c = col + direction[1];

                if (r < 0 || r >= rows || c < 0 || c >= cols) {
                    continue; // Sauter si hors des limites
                }

                // Compter le voisin si vivant
                if (copyBoard[r][c] == 1) {
                    liveNeighbors++;
                }
            }

            // Règles du jeu
            if (copyBoard[row][col] == 1 && (liveNeighbors < 2 || liveNeighbors > 3)) {
                board[row][col] = 0; // Mort par isolement ou surpopulation
            } else if (copyBoard[row][col] == 0 && liveNeighbors == 3) {
                board[row][col] = 1; // Naissance
            }
        }
    }
    }
}