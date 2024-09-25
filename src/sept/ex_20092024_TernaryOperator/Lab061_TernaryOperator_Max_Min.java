package sept.ex_20092024_TernaryOperator;

public class Lab061_TernaryOperator_Max_Min {
    public static void main(String[] args) {
        //max between 2 numbers by ternary operator
        int tushar_sal =4;
        int prabhu_sal =7;
        //max
        int max=tushar_sal>prabhu_sal?tushar_sal:prabhu_sal;
        System.out.println(max);

        //min
        int min=tushar_sal<prabhu_sal?tushar_sal:prabhu_sal;
        System.out.println(min);

        int a=10;
        int b=20;
        int max1 =a>b?a:b;
        int min1 =a<b?a:b;
        System.out.println(max1);
        System.out.println(min1);
    }
}
