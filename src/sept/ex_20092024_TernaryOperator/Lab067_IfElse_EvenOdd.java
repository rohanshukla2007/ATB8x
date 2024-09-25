package sept.ex_20092024_TernaryOperator;

public class Lab067_IfElse_EvenOdd {
    public static void main(String[] args) {
        int num=11;
        if(num%2==0){
            System.out.println("even");
        }else{
            System.out.println("odd");
        }
        int num1=30;
        int num2=30;
        if(num1>num2){
            System.out.println(num1);
        }else if(num2>num1){
            System.out.println(num2);
        }else{
            System.out.println("equal");
        }
    }
}
