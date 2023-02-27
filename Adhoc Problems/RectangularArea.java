package AdhocProblems;

import java.util.Comparator;
import java.util.Scanner;
import java.util.Arrays;
class Rectangle{
    int length;
    int breadth;
    public Rectangle(int length, int breadth){
        this.length = length;
        this.breadth = breadth;
    }

}
class LengthComparator implements Comparator<Rectangle>{
    @Override
    public int compare(Rectangle o1, Rectangle o2){
        return o1.length - o2.length;
    }
}
public class RectangularArea {
    public static void area(Rectangle []rectangles){
        Arrays.sort(rectangles, new LengthComparator());
        int []h = new int[rectangles[rectangles.length-1].length +1];
//        System.out.println(Arrays.toString(rectangles));
        for (Rectangle rectangle : rectangles) {
            int l = rectangle.length;
//            System.out.println(l);
            if (h[l] < rectangle.breadth) {
                h[l] = rectangle.breadth;
//                System.out.println(rectangle.breadth);
            }
//            System.out.println(Arrays.toString(h));
        }
        for(int i=h.length-1; i>0; i--){
            if(h[i] == 0){
                h[i] = h[i+1];
            }
        }
        int halfArea = 0;
//        System.out.println(Arrays.toString(h));
        for(int x : h){
            halfArea += x;
        }
        System.out.println(2*halfArea);
    }
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while(tc-- > 0){
            int n = sc.nextInt();
            Rectangle []rectangle = new Rectangle[n];
            for(int i=0; i<n; i++){
                int length = sc.nextInt();
                int breath = sc.nextInt();
                Rectangle rect = new Rectangle(length/2, breath);
                rectangle[i] = rect;
            }
            area(rectangle);
        }
    }
}
