package Greedy;

// This Code Gives TLE
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;
class Customers{
    int arrivalTime;
    int departureTime;
    int department;
    public Customers(int arrivalTime, int departureTime, int department){
        this.arrivalTime = arrivalTime;
        this.departureTime = departureTime;
        this.department = department;
    }
}
class DepartureTimeComparator implements Comparator<Customers>{

    @Override
    public int compare(Customers o1, Customers o2) {
        return o1.departureTime - o2.departureTime;
    }
}
public class BonAppetit {
    public static int solve(Customers []customer){
        Arrays.sort(customer, new DepartureTimeComparator());
        int count = 1;
        int prevDepartment = customer[0].department;
        int prevDepartureTime = customer[0].departureTime;
        for(int i=1; i <= customer.length-1; i++){
            if(prevDepartment != customer[i].department){
                count++;
//                System.out.println(customer[i-1].department + " " + customer[i].department);
            } else {
                if(prevDepartureTime <= customer[i].arrivalTime){
                    count++;
                    prevDepartureTime = customer[i].departureTime;
                }
            }
            prevDepartment = customer[i].department;

        }
        return count;
    }
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while(tc-- > 0){
            int n = sc.nextInt();
            int k = sc.nextInt();
            Customers []customer = new Customers[n];
            for(int i=0; i<customer.length; i++){
                int arrivalTime = sc.nextInt();
                int departureTime = sc.nextInt();
                int department = sc.nextInt();
                Customers x = new Customers(arrivalTime, departureTime, department);
                customer[i] = x;
            }
            int ans = solve(customer);
            System.out.println(ans);
        }
    }
}
