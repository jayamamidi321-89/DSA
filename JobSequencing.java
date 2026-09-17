package Demo;

import java.util.*;

class Job {

    char id;
    int deadline;
    int profit;

    Job(char id, int deadline, int profit) {
        this.id = id;
        this.deadline = deadline;
        this.profit = profit;
    }
}

public class JobSequencing {

    public static void main(String[] args) {

        Job[] jobs = {
            new Job('A', 2, 100),
            new Job('B', 2, 90),
            new Job('C', 2, 80),
            new Job('D', 2, 70),
            new Job('F', 3, 60)
        };

        // Sort jobs according to profit in descending order
        Arrays.sort(
            jobs,
            (a, b) -> b.profit - a.profit
        );

        // Find maximum deadline
        int maxDeadline = 0;

        for (Job job : jobs) {
            maxDeadline = Math.max(maxDeadline, job.deadline);
        }

        char[] result = new char[maxDeadline + 1];

        boolean[] occupied = new boolean[maxDeadline + 1];

        int totalProfit = 0;

        // Schedule jobs
        for (Job job : jobs) {

            for (int slot = job.deadline; slot >= 1; slot--) {

                if (!occupied[slot]) {

                    occupied[slot] = true;

                    result[slot] = job.id;

                    totalProfit += job.profit;

                    break;
                }
            }
        }

        // Print job sequence
        System.out.println("Job sequence:");

        for (int i = 1; i < result.length; i++) {

            if (result[i] != '\0') {
                System.out.print(result[i] + " ");
            }
        }

        System.out.println();

        System.out.println(
            "Maximum Profit = " + totalProfit
        );
    }
}

