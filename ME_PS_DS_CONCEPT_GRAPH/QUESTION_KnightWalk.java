import java.util.*;

class KnightWalk {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n;
        n = sc.nextInt();
        int starting_pos[] = new int[2];
        int ending_pos[] = new int[2];
        starting_pos[0] = sc.nextInt();
        starting_pos[1] = sc.nextInt();
        ending_pos[0] = sc.nextInt();
        ending_pos[1] = sc.nextInt();
        System.out.println(knightWalk(starting_pos, ending_pos, n));

        sc.close();
    }

    static int knightWalk(int starting_pos[], int ending_pos[], int n) {

        int[][] vis = new int[n + 1][n + 1];
        int minsteps = Integer.MAX_VALUE;

        Queue<int[]> q = new ArrayDeque<>();
        q.add(new int[] { starting_pos[0], starting_pos[1], 0 });
        int[] x = new int[] { 1, 2, 2, 1, -1, -2, -2, -1 };
        int[] y = new int[] { -2, -1, 1, 2, 2, 1, -1, -2 };

        while (!q.isEmpty()) {
            int[] arr = q.poll();
            int row = arr[0];
            int col = arr[1];
            int step = arr[2];

            if (row == ending_pos[0] && col == ending_pos[1]) {
                minsteps = Math.min(minsteps, step);
                break; // Since we found the target position, no need to explore further
            }

            for (int i = 0; i < 8; i++) {
                int newRow = row + x[i];
                int newCol = col + y[i];
                if (check(newRow, newCol, n) && vis[newRow][newCol] == 0) {
                    q.add(new int[] { newRow, newCol, step + 1 });
                    vis[newRow][newCol] = 1;
                }
            }
        }

        if (minsteps == Integer.MAX_VALUE) {
            return -1;
        }
        return minsteps;
    }

    public static boolean check(int x, int y, int n) {
        if (x > 0 && x <= n && y > 0 && y <= n) {
            return true;
        }
        return false;
    }
}
