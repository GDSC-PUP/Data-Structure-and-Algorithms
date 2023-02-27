package Greedy;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;
class Job{
    int startTime;
    int finishTime;
    int profit;
    public Job(int startTime, int finishTime, int profit){
        this.startTime = startTime;
        this.finishTime = finishTime;
        this.profit = profit;
    }
}

class FinishTimeComparator implements Comparator<Job>{
    @Override
    public int compare(Job a, Job b){
        if(a.finishTime < b.finishTime){
            return -1;
        } else if(a.finishTime == b.finishTime){
            return 0;
        }
        else {
            return 1;
        }
    }
}

public class WeightedJobScheduling {

    private static int maximumProfit(Job[] jobs) {
        int []T = new int[jobs.length];
        // Sort the Array Jobs on the Basis of Finish Time
        Arrays.sort(jobs, new FinishTimeComparator());
        T[0] = jobs[0].profit;
        for(int i=1; i<jobs.length; i++){
            T[i] = Math.max(jobs[i].profit , T[i-1]);
            for(int j=i-1; j>=0; j--){
                if(jobs[j].finishTime <= jobs[i].startTime){
                    T[i] = Math.max(T[i], jobs[i].profit + T[j]);
                    break;
                }
            }
        }

        // Now Find Max Value in Array and Return it
        int maxValue = Integer.MIN_VALUE;
        for(int value : T){
            if(value > maxValue){
                maxValue = value;
            }
        }
        return maxValue;
    }

    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while(tc-- > 0){
            int n = sc.nextInt();
            Job []jobs = new Job[n];
            for(int i=0; i<jobs.length; i++){
                int startTime = sc.nextInt();
                int finishTime = sc.nextInt();
                int profit = sc.nextInt();
                Job job = new Job(startTime, finishTime, profit);
                jobs[i]  = job;
            }
            // Display the Output of Maximum Profit that can be made
            int ans = maximumProfit(jobs);
            System.out.println("Maximum Profit that can be Made: " + ans);
        }
    }
}
