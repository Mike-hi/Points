// A program that deals with 2D points.
// Fifth version, to accompany immutable Point class.
import java.awt.*;
import java.util.Scanner;
import java.util.ArrayList;
public class PointMainLessHelp {
    public static void main(String[] args) {
        // create two Point objects
        Point p1 = new Point(1,2);
        Point p2 = new Point(3,4);
        PointLess pMore = new PointLess();

        // print each point and its distance from origin
        System.out.println("p1 is " + p1);
        System.out.println("p1 distance from origin = " + (p1.x * p1.y));
        
        System.out.println("p2 is " + p2);
        System.out.println("p2 distance from origin = " + (p2.x * p2.y));

        // translate each point to a new location
        p1.translate(2, 5);
        p2.translate(0, 3);

        // print the points again
        System.out.println("p1 translated is now " + p1);
        System.out.println("p2 translated is now " + p2);
        //Arraylist of points based on user input
        Scanner scnr = new Scanner(System.in);
        ArrayList <Point> user = new ArrayList <Point>();
        boolean b = false;
        while(b != true){
            System.out.println("enter an x for a Point :");
            int x = scnr.nextInt();
            System.out.println("enter an y for a Point :");
            int y = scnr.nextInt();
            
            Point temp = new Point(x, y);
            user.add(temp);
            
            System.out.println("type / to stop");
            String stop = scnr.next();
            if(stop.equals("/")){
                b = true;
            }
        }
    }
}
