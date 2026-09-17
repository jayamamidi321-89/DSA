package Demo;

import java.util.*;

class Activity {
    int start;
    int finish;

    Activity(int start, int finish) {
        this.start = start;
        this.finish = finish;
    }
}

public class ActivitySelection {

    public static void main(String[] args) {

        Activity[] activities = {
            new Activity(1, 3),
            new Activity(2, 4),
            new Activity(3, 5),
            new Activity(5, 7),
            new Activity(5, 9),
            new Activity(8, 10)
        };

        // Sort activities by finish time
        Arrays.sort(
            activities,
            Comparator.comparingInt(a -> a.finish)
        );

        int count = 1;
        int lastFinish = activities[0].finish;

        System.out.println(
            "Selected: " + activities[0].start + " - " + activities[0].finish
        );

        for (int i = 1; i < activities.length; i++) {

            if (activities[i].start >= lastFinish) {

                System.out.println(
                    "Selected: " + activities[i].start + " - " + activities[i].finish
                );

                lastFinish = activities[i].finish;
                count++;
            }
        }

        System.out.println("Total activities selected: " + count);
    }
}