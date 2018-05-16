package com.zet1;

import java.util.HashSet;
import java.util.Set;

public class Sudoko {

	 private static boolean evaluateSudoku() {
		//Here is our input as 9*9 matrix.
		        int[][] l_arrSudukoMatrix = new int[][] {
		                { 5, 1, 3, 6, 8, 7, 2, 4, 9 }, 
		                { 8, 4, 9, 5, 2, 1, 6, 3, 7 },
		                { 2, 6, 7, 3, 4, 9, 5, 8, 1 }, 
		                { 1, 5, 8, 4, 6, 3, 9, 7, 2 },
		                { 9, 7, 4, 2, 1, 8, 3, 6, 5 }, 
		                { 3, 2, 6, 7, 9, 5, 4, 1, 8 },
		                { 7, 8, 2, 9, 3, 4, 1, 5, 6 }, 
		                { 6, 3, 5, 1, 7, 2, 8, 9, 4 },
		                { 4, 9, 1, 8, 5, 6, 7, 2, 3 } };
		        Set<Integer> l_stRowSet = new HashSet<Integer>();
		        Set<Integer> l_stColumnSet = new HashSet<Integer>();
		//Here haveDuplicate variable to return the true/false. If haveDuplicate is false the sudoku is valid one.Otherwise its wrong sudoku.
		        boolean haveDuplicate = true;

		        for (int i = 0; i < l_arrSudukoMatrix.length; i++) {
		            for (int j = 0; j < l_arrSudukoMatrix[i].length; j++) {
		//Here to check the entered value is greater than zero and less than 10
		              if(l_arrSudukoMatrix[i][j] > 0 && l_arrSudukoMatrix[i][j] < 10){
		                l_stRowSet.add(l_arrSudukoMatrix[i][j]);
		                }
		            }
		            for (int j = 0; j < l_arrSudukoMatrix[i].length; j++) {
		//Here to check the entered value is greater than zero and less than 10
		              if(l_arrSudukoMatrix[j][i] > 0 && l_arrSudukoMatrix[j][i] < 10){
		                l_stColumnSet.add(l_arrSudukoMatrix[j][i]);
		                }
		            }
		//If Row/Column have less than 9 size we have some repeated value, so we can return true.
		            if (l_stRowSet.size() != 9 && l_stColumnSet.size() != 9) {
		                return false;
		            }
		        }

		        return haveDuplicate;

		    }
	 
	 public boolean isValidSudoku(char[][] board) {
			if (board == null || board.length != 9 || board[0].length != 9)
				return false;
			// check each column
			for (int i = 0; i < 9; i++) {
				boolean[] m = new boolean[9];
				for (int j = 0; j < 9; j++) {
					if (board[i][j] != '.') {
						if (m[(int) (board[i][j] - '1')]) {
							return false;
						}
						m[(int) (board[i][j] - '1')] = true;
					}
				}
			}
		 
			//check each row
			for (int j = 0; j < 9; j++) {
				boolean[] m = new boolean[9];
				for (int i = 0; i < 9; i++) {
					if (board[i][j] != '.') {
						if (m[(int) (board[i][j] - '1')]) {
							return false;
						}
						m[(int) (board[i][j] - '1')] = true;
					}
				}
			}
		 
			//check each 3*3 matrix
			for (int block = 0; block < 9; block++) {
				boolean[] m = new boolean[9];
				for (int i = block / 3 * 3; i < block / 3 * 3 + 3; i++) {
					for (int j = block % 3 * 3; j < block % 3 * 3 + 3; j++) {
						if (board[i][j] != '.') {
							if (m[(int) (board[i][j] - '1')]) {
								return false;
							}
							m[(int) (board[i][j] - '1')] = true;
						}
					}
				}
			}
		 
			return true;
		}
	public static void main(String[] args) {
System.out.println(evaluateSudoku());
	}

}
