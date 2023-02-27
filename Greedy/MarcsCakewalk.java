package Greedy;
import java.util.Arrays;
import java.util.Scanner;

public class MarcsCakewalk {
    public static int marcsCakeWalk(int []calories){
        // Step 1:
        Arrays.sort(calories);
        int j = 0;
        int minCalories = 0;
        for(int i=calories.length-1; i>=0; i--){
            minCalories += (calories[i]*Math.pow(2, j));
            j++;
        }
        return minCalories;
    }
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while(tc-- > 0){
            int n = sc.nextInt();
            int []calories = new int[n];
            for(int i=0; i<calories.length; i++){
                calories[i] = sc.nextInt();
            }
            int ans = marcsCakeWalk(calories);
            System.out.println(ans);
        }
    }
}
