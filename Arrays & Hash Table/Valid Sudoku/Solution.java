// Time complexity: O(1) car on parcourt un tableau 9*9  (O(9*9));

// Space complexity: O(1) car O(3*9*9)


// The box index correspond to boxes:
// 0 1 2 (i=0 j=[0,1,2])
// 3 4 5 (i=3 j=[0,1,2])
// 6 7 8 (i=6 j=[0,1,2])

import java.util.*;

class Solution {
    public boolean isValidSudoku(char[][] board) {
        // Arrays of hash sets for rows, columns, and boxes
        HashSet<Character>[] rows = new HashSet[9];
        HashSet<Character>[] cols = new HashSet[9];
        HashSet<Character>[] boxes = new HashSet[9];
        
        // Initialize hash sets
        for (int i = 0; i < 9; i++) {
            rows[i] = new HashSet<Character>();
            cols[i] = new HashSet<Character>();
            boxes[i] = new HashSet<Character>();
        }
        
        // Traverse the board
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                char num = board[i][j];
                
                if (num != '.') {
                    // Calculate box index
                    int boxIndex = (i/3)*3  + j / 3;
                    
                    // Check row, column, and box
                    if (rows[i].contains(num) || cols[j].contains(num) || boxes[boxIndex].contains(num)) {
                        return false;
                    }
                    
                    // Update the sets
                    rows[i].add(num);
                    cols[j].add(num);
                    boxes[boxIndex].add(num);
                }
            }
        }
        
        return true;
    
    }
}
