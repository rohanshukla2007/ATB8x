package sept.ex_20092024_TernaryOperator;

public class Lab068__IfElse_GradeCalculator {
    public static void main(String[] args) {
        //grade calculatotr;
        //write a program and displays based on grade scale
        //A:90-100
        //B:80-89
        //C:70-79
        //D:60-69
        //F:0-59
        int score=98;
        char Grade;
        if (score>=90 && score<=100){
            Grade='A';
        } else if(score>=80 && score<=89){
            Grade='B';
        }else if(score>=70 && score<=79){
            Grade='C';
        }else if(score>=60 && score<=69){
            Grade='D';
        }else if(score<0 || score>100){
            Grade='0';
            System.out.println("invalid");
        }else{
            Grade='F';
        }
        System.out.println(Grade);
    }
}
