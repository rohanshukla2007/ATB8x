package sept.Task;
import java.util.Scanner;

public class Task11_TriangleClassifier_IfElse {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Side 1");
        int s1=sc.nextInt();
        System.out.println("Enter Side 2");
        int s2=sc.nextInt();
        System.out.println("Enter Side 3");
        int s3= sc.nextInt();

        if((s1==s2) && (s2==s3) && (s3==s1)) {
            System.out.println("Triangle is equilateral 'all sides are equal'");
        } else if ((s1!=s2) && (s2!=s3) && (s3!=s1)) {
            System.out.println("Triangle is scalene 'no sides are equal'");
        }
        else {
            System.out.println("Triangle is isosceles 'exactly two sides are equal'");
        }
    }
}
