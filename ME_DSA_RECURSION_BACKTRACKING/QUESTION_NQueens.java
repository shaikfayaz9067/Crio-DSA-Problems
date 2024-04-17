import java.util.*;

public class NQueens {
    List<List<String>> solutions;

    public List<List<String>> nQueens(int n) {
        solutions = new ArrayList<>();
        int[][] board = new int[n][n];
        solveNQueensUtil(board, 0, n);
        return solutions;
    }

    void solveNQueensUtil(int[][] board, int col, int n) {
        if (col == n) {
            addSolution(board, n);
            return;
        }

        for (int i = 0; i < n; i++) {
            if (isSafe(board, i, col, n)) {
                board[i][col] = 1;
                solveNQueensUtil(board, col + 1, n);
                board[i][col] = 0;
            }
        }
    }

    boolean isSafe(int[][] board, int row, int col, int n) {
        int i, j;

        // Check this row on the left side
        for (i = 0; i < col; i++) {
            if (board[row][i] == 1) {
                return false;
            }
        }

        // Check upper diagonal on left side
        for (i = row, j = col; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j] == 1) {
                return false;
            }
        }

        // Check lower diagonal on left side
        for (i = row, j = col; j >= 0 && i < n; i++, j--) {
            if (board[i][j] == 1) {
                return false;
            }
        }

        return true;
    }

    void addSolution(int[][] board, int n) {
        List<String> solution = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            StringBuilder sb = new StringBuilder();
            for (int j = 0; j < n; j++) {
                sb.append(board[i][j]);
            }
            solution.add(sb.toString());
        }
        solutions.add(solution);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // System.out.print("Enter the number of queens: ");
        int n = scanner.nextInt();
        scanner.close();
        NQueens result = new NQueens();
        List<List<String>> boards = result.nQueens(n);
        if (boards.isEmpty()) {
            System.out.println("No Solution Exists");
        } else {
            for (List<String> board : boards) {
                for (String row : board) {
                    System.out.println(row);
                }
                System.out.println();
            }
        }
    }
}

/* 
Crio Methodology

Milestone 1: Understand the problem clearly
1. Ask questions & clarify the problem statement clearly.
2. Take an example or two to confirm your understanding of the input/output

Milestone 2: Finalize approach & execution plan
1. Understand what type of problem you are solving and see if you can recollect solving similar problems in the past
      a. Obvious logic (this would only test ability to convert logic to code)
      b. Figuring out logic
      c. Knowledge of specific algorithm, data structure or pattern
      d. Knowledge of specific domain or concepts
      e. Mapping real world into abstract concepts/data structures
2. Brainstorm multiple ways to solve the problem and pick one based on the TC/SC requirements
3. Get to a point where you can explain your approach to a 10 year old

Milestone 3 : Come up with an Instruction Manual for a 10 year old
1. Take a stab at the high-level logic & write it down like a detailed Instruction Manual for a 10 Year old where each line of the manual can be expanded into a logical line(s) of code.
2. Try to offload logic out of the main section as much as possible by delegating to functions.

Milestone 4: Code by expanding your 10 Year Olds "Instruction Manual
1. Run your code snippets at every logical step to test correctness (Helps avoid debugging larger pieces of code later)
2. Make sure you name the variables, functions clearly.
3. Use libraries as much as possible

Milestone 5: Prove that your code works using custom test cases
1. Make sure you check boundary conditions and other test cases you noted in Milestone 1
      a. If compiler is not available, dry run your code on a whiteboard or paper
2. Suggest optimizations if applicable during interviews
*/