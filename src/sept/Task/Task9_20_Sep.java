package sept.Task;

public class Task9_20_Sep {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int c = 45;
       // int max = (a>b ? a:b)>c ? (a>b ? a:b):c;
        int max= (a>c) ? (a>b ? a:b) : (b>c ? b:c);
        System.out.println(max);
    }
}
