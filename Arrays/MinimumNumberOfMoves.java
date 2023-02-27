package Arrays;
import java.util.Scanner;
public class MinimumNumberOfMoves {
    public static void main (String[] args) throws java.lang.Exception
    {

        // your code goes here
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            int []salaries = new int[n];
            int min = Integer.MAX_VALUE;
            for(int i=0; i<salaries.length; i++){
                salaries[i] = sc.nextInt();
                if(salaries[i] < min){
                    min = salaries[i];
                }
            }
            int sumW = 0;
            for(int salary : salaries){
                sumW += salary;
            }
            System.out.println(sumW - n*min);
        }
    }
}
