package Arrays;
import java.util.Scanner;
public class ChefAndNotebooks {
    public static void main (String[] args) throws java.lang.Exception
    {

        // your code goes here
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int pagesLongPoetry = sc.nextInt();
            int leftPages = sc.nextInt();
            int budget = sc.nextInt();
            int shops = sc.nextInt();
            int []pages = new int[shops];
            int []price = new int[shops];
            for(int i=0; i<shops; i++){
                pages[i]= sc.nextInt();
                price[i] = sc.nextInt();
            }
            boolean flag = false;
            for(int i=0; i<shops; i++){
                if(leftPages + pages[i] >= pagesLongPoetry && budget >= price[i]){
                    System.out.println("LuckyChef");
                    flag = true;
                    break;
                }
            }
            if(!flag){
                System.out.println("UnluckyChef");
            }
        }
    }
}
