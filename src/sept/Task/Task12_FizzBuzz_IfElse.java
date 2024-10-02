package sept.Task;
import java.util.Scanner;

public class Task12_FizzBuzz_IfElse {
    public static void main(String [] args) {
        Scanner s = new Scanner(System.in);
        //System.out.println("Enter any number between 1 to 100");
        //int n = s.nextInt();

        for(int i = 1; i <=100; i++) {
            if(i%3==0) {
                System.out.println("Fizz");
            }
            if(i%5==0) {
                System.out.println("Buzz");
            }
            if(i%3==0 && i%5==0) {
                System.out.println("FizzBuzz");
            }
        }
    }
}