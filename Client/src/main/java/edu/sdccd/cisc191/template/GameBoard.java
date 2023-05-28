package edu.sdccd.cisc191.template;
import java.util.Arrays;
public class GameBoard extends BoardInfo {

    //Edits Gameboard
    public void editBoard(int index, int value) {
        board[index] = value;
        int row = index / 3;
        int col = index % 3;
        board2D[row][col] = value;
        printBoard(); // Print the updated board
    }

    // prints out gameboard results
    private void printBoard() {
        System.out.println(Arrays.toString(board));
        for (int[] ints : board2D) {
            System.out.println(Arrays.toString(ints));
        }
    }
}
