import java.util.*;
import java.io.*;

class MaxAreaOfIsland {

    public static int maxAreaOfIsland(ArrayList<ArrayList<Integer>> grid) {
        int n = grid.size();
        int m = grid.get(0).size();
        int[][] vis = new int[n][m];
        int maxArea = 0;
        Queue<int[]> q = new ArrayDeque<>();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (grid.get(i).get(j) == 1 && vis[i][j] == 0) {
                    int count = 1;
                    q.add(new int[]{i, j});
                    vis[i][j] = 1;
                    while (!q.isEmpty()) {
                        int[] arr = q.poll();
                        int[] x = new int[]{0, 1, 0, -1};
                        int[] y = new int[]{-1, 0, 1, 0};
                        for (int s = 0; s < 4; s++) {
                            int newRow = arr[0] + x[s];
                            int newCol = arr[1] + y[s];
                            if (check(newRow, newCol, n, m) && grid.get(newRow).get(newCol) == 1 && vis[newRow][newCol] == 0) {
                                q.add(new int[]{newRow, newCol});
                                vis[newRow][newCol] = 1;
                                count++;
                            }
                        }
                    }
                    maxArea = Math.max(maxArea, count);
                }
            }
        }
        return maxArea;
    }

    public static boolean check(int x, int y, int n, int m) {
        return x >= 0 && x < n && y >= 0 && y < m;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n, m;

        n = sc.nextInt();
        m = sc.nextInt();

        ArrayList<ArrayList<Integer>> a = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            ArrayList<Integer> b = new ArrayList<>();

            for (int j = 0; j < m; j++) {
                b.add(sc.nextInt());
            }
            a.add(b);
        }

        int ans = MaxAreaOfIsland.maxAreaOfIsland(a);
        System.out.println(ans);
    }
}
