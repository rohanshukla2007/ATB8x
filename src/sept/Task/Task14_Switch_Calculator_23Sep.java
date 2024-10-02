package sept.Task;

import java.util.Scanner;

public class Task14_Switch_Calculator_23Sep {
    public static void main(String[] args) {
       // int num1 = 7;
//        int num2 = 2;
        char ch = '+';
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number 1");
        int num1 = sc.nextInt();
        System.out.println("Enter number 2");
        int num2 = sc.nextInt();
//        System.out.println("Enter operator");
//        String ch = sc.nextLine();


        switch(ch) {
            case '+' :
                System.out.println("Sum of " + num1 + " "  + "and " + num2 + " " + "is " + (num1+num2));
                break;
            case '-' :
                System.out.println("Difference of " + num1 + " " + "and" + num2 + " " + "is " + (num1-num2));
                break;
            case '*' :
                System.out.println("Multiplication of " + num1 + " " + "and " + num2 + " " + "is " + (num1*num2));
                break;
            case '/' :
                System.out.println("Division of " + num1 + " " + "and " + num2 + " " + "is " + (num1/num2));
                break;
            default :
                System.out.println("Operation not mentioned");
        }
    }
}

