import java.util.*;

class JobSequencing {
    static class JobPerform {
        int deadline;
        int profit;

        public JobPerform(int deadline, int profit) {
            this.deadline = deadline;
            this.profit = profit;
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int deadlines[] = new int[n];
        int profits[] = new int[n];

        for (int i = 0; i < n; i++) {
            deadlines[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            profits[i] = sc.nextInt();
        }

        System.out.println(jobSequencing(n, deadlines, profits));
    }

    static int jobSequencing(int n, int deadlines[], int profits[]) {
        int maxProfit = 0;
        int maxDeadline = 0;
        for (int i = 0; i < n; i++) {
            maxDeadline = Math.max(maxDeadline, deadlines[i]);
        }

        JobPerform[] jobs = new JobPerform[n];
        for (int i = 0; i < n; i++) {
            jobs[i] = new JobPerform(deadlines[i], profits[i]);
        }

        Arrays.sort(jobs, (a, b) -> b.profit - a.profit);

        boolean[] slots = new boolean[maxDeadline + 1];
        Arrays.fill(slots, false);

        for (int i = 0; i < n; i++) {
            for (int j = Math.min(maxDeadline, jobs[i].deadline); j > 0; j--) {
                if (!slots[j]) {
                    slots[j] = true;
                    maxProfit += jobs[i].profit;
                    break;
                }
            }
        }
        return maxProfit;
    }
}
