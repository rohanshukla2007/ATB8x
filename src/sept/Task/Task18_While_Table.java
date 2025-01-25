package sept.Task;

public class Task18_While_Table {
    public static void main(String[] args) {
        int num = 10;
        int i = 1;
        while(i<=num) {
            int res = num*i;
            System.out.println(num + " x " + i + " = " + res);
            i++;
        }
    }
}
