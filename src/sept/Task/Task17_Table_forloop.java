package sept.Task;

import java.util.Scanner;

public class Task17_Table_forloop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // New Object
        System.out.println("Enter the number");
        int num = sc.nextInt();
        System.out.println(num);
        for (int i = 1; i<=10; i++) {
            int res = num*i;
            System.out.println(num + " x " + i + " = " + res);
        }
    }
}
