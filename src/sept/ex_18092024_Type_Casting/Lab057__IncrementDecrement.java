package sept.ex_18092024_Type_Casting;

public class Lab057__IncrementDecrement {
    public static void main(String[] args) {
        int a = 10;
        System.out.println(a++ + a);
        //A -> a++ -> Exp1 = 11
        //B -> a -> Exp2 = 10, a=10

        int b = 10;
        System.out.println(b++ + ++b);
        System.out.println(b);
        //A -> a++ -> 10, a=11
        //+
        //B -> ++a -> a=12 b-> 12

        //Line no | a | exp
        //      | 10 | NA
        //     | 12 | 10 | 12

        int c = 10;
        System.out.println(++c + ++c);
        System.out.println(c);
        //A -> ++a -> Exp1 -> 11, a=11
        //+
        //B -> ++a -> a=12 , Exp2 = 12
        //23, 12

        int d = 10;
        System.out.println(++d + d++ + d++);
        System.out.println(d);
        //A -> ++a -> Exp1 = 11, a=11
        //B -> a++ -> Exp2 = 11, a=12
        //C -> a++ -> Exp3 = 12, a=13

    }
}
