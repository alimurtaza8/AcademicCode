package backtracking;


import java.util.*;

public class BackTracking1 {

	public static void main(String[] args) {
		
		//Permutation 
		String str = "ABC";
		printPermutaions(str, "");

		print all solutions where queens are safe

		System.out.println(solveNQueens(4));

		int[] nums = {1, 2, 3};
        List<List<Integer>> permutations = permute(nums);
        System.out.println(permutations);

		char[][] board = {
			{'5','3','.','.','7','.','.','.','.'},
			{'6','.','.','1','9','5','.','.','.'},
			{'.','9','8','.','.','.','.','6','.'},
			{'8','.','.','.','6','.','.','.','3'},
			{'4','.','.','8','.','3','.','.','1'},
			{'7','.','.','.','2','.','.','.','6'},
			{'.','6','.','.','.','.','2','8','.'},
			{'.','.','.','4','1','9','.','.','5'},
			{'.','.','.','.','8','.','.','7','9'}


		int grid[][] = { { 3, 0, 6, 5, 0, 8, 4, 0, 0 },
                         { 5, 2, 0, 0, 0, 0, 0, 0, 0 },
                         { 0, 8, 7, 0, 0, 0, 0, 3, 1 },
                         { 0, 0, 3, 0, 1, 0, 0, 8, 0 },
                         { 9, 0, 0, 8, 6, 3, 0, 0, 5 },
                         { 0, 5, 0, 0, 9, 0, 6, 0, 0 },
                         { 1, 3, 0, 0, 0, 0, 2, 5, 0 },
                         { 0, 0, 0, 0, 0, 0, 0, 7, 4 },
                         { 0, 0, 5, 2, 0, 6, 3, 0, 0 } };
 
        if (solveSudoku(grid, 0, 0))
            print(grid);
        else
            System.out.println("No Solution exists");
		
	}



	//Sudoku Solver (Backtracking) right solutions

	// N is the size of the 2D matrix   N*N
    static int N = 9;
 
    /* Takes a partially filled-in grid and attempts
    to assign values to all unassigned locations in
    such a way to meet the requirements for
    Sudoku solution (non-duplication across rows,
    columns, and boxes) */
    static boolean solveSudoku(int grid[][], int row,
                               int col)
    {
 
        /*if we have reached the 8th
           row and 9th column (0
           indexed matrix) ,
           we are returning true to avoid further
           backtracking       */
        if (row == N - 1 && col == N)
            return true;
 
        // Check if column value  becomes 9 ,
        // we move to next row
        // and column start from 0
        if (col == N) {
            row++;
            col = 0;
        }
 
        // Check if the current position
        // of the grid already
        // contains value >0, we iterate
        // for next column
        if (grid[row][col] != 0)
            return solveSudoku(grid, row, col + 1);
 
        for (int num = 1; num < 10; num++) {
 
            // Check if it is safe to place
            // the num (1-9)  in the
            // given row ,col ->we move to next column
            if (isSafe(grid, row, col, num)) {
 
                /*  assigning the num in the current
                (row,col)  position of the grid and
                assuming our assigned num in the position
                is correct */
                grid[row][col] = num;
 
                // Checking for next
                // possibility with next column
                if (solveSudoku(grid, row, col + 1))
                    return true;
            }
            /* removing the assigned num , since our
               assumption was wrong , and we go for next
               assumption with diff num value   */
            grid[row][col] = 0;
        }
        return false;
    }
 
    /* A utility function to print grid */
    static void print(int[][] grid)
    {
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++)
                System.out.print(grid[i][j] + " ");
            System.out.println();
        }
    }
 
    // Check whether it will be legal
    // to assign num to the
    // given row, col
    static boolean isSafe(int[][] grid, int row, int col,
                          int num)
    {
 
        // Check if we find the same num
        // in the similar row , we
        // return false
        for (int x = 0; x <= 8; x++)
            if (grid[row][x] == num)
                return false;
 
        // Check if we find the same num
        // in the similar column ,
        // we return false
        for (int x = 0; x <= 8; x++)
            if (grid[x][col] == num)
                return false;
 
        // Check if we find the same num
        // in the particular 3*3
        // matrix, we return false
        int startRow = row - row % 3;
		int startCol = col - col % 3;
                                      
        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 3; j++)
                if (grid[i + startRow][j + startCol] == num)
                    return false;
 
        return true;
    }





	//Sudoku Solver (Backtracking)

	public static boolean isSafe(char[][] board, int row, int col, int number){

		// column
		for(int i=0; i < board.length; i++){
			if(board[i][col] == (char)(number+'0')){
				return false;
			}
		}
		// Row
		for(int j=0; j<board.length; j++){
			if(board[row][j] == (char)(number+'0')){
				return false;
			}
		}
		// grid
		int sr = 3 * (row/3);
		int sc = 3 * (col/3);

		for(int i=sr; i<sr+3; i++){
			for(int j=sr; j<sc+3; j++){
				if(board[i][j] == (char)(number+'0')){
					return false;
				}
			}
		}
		return true;
	}

	public static boolean helper(char[][] board, int row, int col){
		if(row == board.length){
			return true;
		}

		int nrow = 0;
		int ncol = 0;
		if(col == board.length-1){
			nrow = row + 1;
			ncol = 0;
		}
		else{
			nrow = row;
			ncol = col + 1;
		}

		if(board[row][col] != '.'){
			if(helper(board, nrow, ncol)){
				return true;
			}
		}
		else{
			//fill the place
			for(int i=1; i<=9; i++){
				if(isSafe(board,row,col,i)){
					board[row][col] = (char)(i+'0');
					if(helper(board, nrow, ncol)){
						return true;
					}
					else{
						board[row][col] = '.';
					}
				}
			}
		}
		return false;
	}
	
	public static void solveSodoku(char[][] board){

		helper(board,0,0);
	}

	static void print(char[][] board)
    {
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++)
                System.out.print(board[i][j] + " ");
            System.out.println();
        }
    }

	print all possible permuatations
	
 private static void backtrack(List<List<Integer>> result, List<Integer> tempList, int[] nums) {
        if (tempList.size() == nums.length) {
            result.add(new ArrayList<>(tempList));
            return;
        }
        for (int i = 0; i < nums.length; i++) {
            if (tempList.contains(nums[i])) {
                continue; 
            }
            tempList.add(nums[i]);
            backtrack(result, tempList, nums);
            tempList.remove(tempList.size() - 1);
        }
    }

	public static List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> tempList = new ArrayList<>();
        backtrack(result, tempList, nums);
        return result;
    }

   




	print all solutions where queens are safe

	public static boolean isSafe(int row, int col, char[][] board){
		//horizontal
		for(int j=0; j<board.length; j++){
			if(board[row][j] == 'Q'){
				return false;
			}
		}

		//vertical
		for(int i=0; i<board.length; i++){
			if(board[i][col] == 'Q'){
				return false;
			}
		}

		//upper left
		int r = row;
		for(int c=col; c>=0 && r>=0; c--,r--){
			if(board[r][c] == 'Q'){
				return false;
			}
		}

		//upper right
		r = row;
		for(int c=col; c<board.length && r>=0; c++,r--){
			if(board[r][c] == 'Q'){
				return false;
			}
		}

		//lower left
		r = row;
		for(int c=col; c>=0 && r<board.length; c--,r++){
			if(board[r][c] == 'Q'){
				return false;
			}
		}

		//lower right
		for(int c=col; c<board.length && r<board.length; c++,r++){
			if(board[r][c] == 'Q'){
				return false;
			}
		}

		return true;
	}

	public static void saveBoard(char[][] board, List<List<String>> allBoards){

		String row = "";
		List<String> newBoards = new ArrayList<>();

		for(int i=0; i<board.length; i++){
			row = "";
			for(int j=0; j<board.length; j++){
				if(board[i][j] == 'Q'){
					row+='Q';
				}
				else{
					row+='.';
				}
			}
			newBoards.add(row);
		}
		allBoards.add(newBoards);
	}

	public static void helper(char[][] board, List<List<String>> allBoards, int col){
		if(col == board.length){
			saveBoard(board,allBoards);
			return;
		}

		for(int row = 0; row < board.length; row++){
			if(isSafe(row,col,board)){
				board[row][col] = 'Q';
				helper(board, allBoards, col+1);
				board[row][col] = '.';
			}
		}
	}

	public static List<List<String>> solveNQueens(int n){
		List<List<String>> allBoards = new ArrayList<>();
		char[][] board = new char[n][n];
		helper(board,allBoards,0);
		return allBoards;
	}



	
	//Permutation 
	public static void printPermutaions(String str, String permutation){
		if(str.length() == 0){
			System.err.println(permutation);
			return;
		}

		for(int i=0; i<str.length(); i++){
			char currChar = str.charAt(i);
			String newString = str.substring(0, i) + str.substring(i+1);
			printPermutaions(newString, permutation+currChar);
		}
	}
	

}
