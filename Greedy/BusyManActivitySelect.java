package Greedy;

import java.util.Comparator;
import java.util.Scanner;
import java.util.Arrays;

class Activity{
    int startTime;
    int finishTime;
    public Activity(int startTime, int finishTime){
        this.startTime = startTime;
        this.finishTime = finishTime;
    }
}
class FinishTimeComparator1 implements Comparator<Activity>{
    @Override
    public int compare(Activity a, Activity b){
        if(a.finishTime < b.finishTime){
            return -1;
        } else if(a.finishTime == b.finishTime){
            return 0;
        } else {
            return 1;
        }
    }
}

public class BusyManActivitySelect {
    public static int activitySelect(Activity []activities){
        Arrays.sort(activities, new FinishTimeComparator1());
        int count = 1;
        int currFinish = activities[0].finishTime;
        for(int i=1; i<activities.length; i++){
            if(activities[i].startTime >= currFinish){
                currFinish = activities[i].finishTime;
                count++;
            }
        }
        return  count;
    }

    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while(tc-- > 0){
            int n = sc.nextInt();
            Activity []activities = new Activity[n];
            for(int i=0; i < activities.length; i++){
                int startTime = sc.nextInt();
                int finishTime = sc.nextInt();
                Activity activity = new Activity(startTime, finishTime);
                activities[i] = activity;
            }
            int ans = activitySelect(activities);
            System.out.println(ans);
        }
    }
}

/*

            1
            6
            7 9
            5 8
            6 7
            4 6
            2 5
            1 3
            4

 */