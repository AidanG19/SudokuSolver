public class SudokuSolver
{
    private static final int GRID_SIZE = 9;

    public static void main(String[]args)
    {
        int[][] board = {
            {7, 0, 2, 0, 5, 0, 6, 0, 0},
            {0, 0, 0, 0, 0, 3, 0, 0, 0},
            {1, 0, 0, 0, 0, 9, 5, 0, 0},
            {8, 0, 0, 0, 0, 0, 0, 9, 0},
            {0, 4, 3, 0, 0, 0, 7, 5, 0},
            {0, 9, 0, 0, 0, 0, 0, 0, 8},
            {0, 0, 9, 7, 0, 0, 0, 0, 5},
            {0, 0, 0, 2, 0, 0, 0, 0, 0}, 
            {0, 0, 7, 0, 4, 0, 2, 0, 3} 
        };


        System.out.println("Unsolved Sudoku:\n");
        display(board);

        if(solvedBoard(board))
        {
            System.out.println("Sudoku Solved");
        }
        else
        {
            System.out.println("Sudoku is unsolvable");
        }
        System.out.println("Solved Sudoku:\n");
        display(board);

    }

    private static void display(int[][]board)
    {
        for (int i = 0; i < GRID_SIZE; i++) 
        {
            if(i % 3 == 0 && i != 0)
            {
                System.out.println("-----------");
            }

            for (int j = 0; j < GRID_SIZE; j++) 
            {
                if(j%3 == 0 && j != 0)
                {
                    System.out.print("|");
                }
                System.out.print(board[i][j]);
            }
            System.out.println();
        }
    }
    private static boolean rowCheck(int[][] board , int number , int row)
    {
        for (int i = 0; i < GRID_SIZE; i++) 
        {
            if(board[row][i] == number)
            {
                return true;
            }
        }
        return false;
    }

    private static boolean columnCheck(int[][] board , int number , int column)
    {
        for (int i = 0; i < GRID_SIZE; i++) 
        {
            if(board[i][column] == number)
            {
                return true;
            }
        }
        return false;
    }

    private static boolean boxCheck(int[][] board , int number , int row, int column)
    {
        
        int boxRow = row - row % 3;
        int boxColumn = column - column % 3;

        for (int i = boxRow; i < boxRow + 3; i++) 
        {
            for (int j = boxColumn; j < boxColumn + 3; j++) 
            {
                if(board[i][j] == number)
                {
                    return true;
                }
            }
        }
        return false;
    }

    private static boolean placementCheck(int[][] board , int number , int row, int column)
    {
        return !rowCheck(board , number , row) && !columnCheck(board , number , column) && !boxCheck(board , number , row , column);
    }

    private static boolean solvedBoard(int[][] board)
    {
        for (int i = 0; i < GRID_SIZE; i++) 
        {
            for (int j = 0; j < GRID_SIZE; j++) 
            {
                if(board[i][j] == 0)
                {
                    for (int k = 1; k <= GRID_SIZE; k++)
                    {
                        if(placementCheck(board, k, i, j))
                        {
                            board[i][j] = k;

                            if(solvedBoard(board))
                            {
                                return true;
                            }
                            else
                            {
                                board[i][j] = 0;  
                            
                            }
                        }
                    }
                    return false;
                }
            }
        }
        return true;
    }

    


}