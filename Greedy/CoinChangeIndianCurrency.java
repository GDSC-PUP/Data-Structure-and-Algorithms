package Greedy;

import java.util.Scanner;

public class CoinChangeIndianCurrency {
    public static int coinDenomination(int money, int []denominations){
        int res = 0;
        System.out.print(money + " -> ");
        while(money > 0){
            for(int i=denominations.length-1 ; i>=0; i--){
                if(money - denominations[i] >= 0){
                    money -= denominations[i];
                    System.out.print(denominations[i] + " -> ");
                    res += 1;
                    break;
                }
            }
        }
        System.out.print("0");
        return res;
    }
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while(tc-- > 0){
            int n = sc.nextInt();
            int []denominations = {1, 2, 5, 10, 20, 50, 100, 200, 500, 1000, 2000};
            int ans = coinDenomination(n, denominations);
            System.out.println();
            System.out.println(ans);
        }
    }
}
