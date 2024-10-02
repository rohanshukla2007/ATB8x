package sept.Task;
import java.util.Scanner;

public class Task10_20_Sep {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your grade");
        int score= sc.nextInt();

        String grade=(score >=90) ?  "A":(( score >=80)? "B" : "C");
        System.out.println("Score: " + score + ", Grade: " + grade);
    }
}
