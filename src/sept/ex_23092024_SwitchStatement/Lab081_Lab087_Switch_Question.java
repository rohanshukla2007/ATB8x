package sept.ex_23092024_SwitchStatement;

public class Lab081_Lab087_Switch_Question {
    public static void main(String[] args) {
        char code ='C';
        switch(code){
            default:
                System.out.println("heloooo");//if break is missing
                //output is helooo and 65
            case 'A':
                System.out.println("65");
                break;
            case 'B':
                System.out.println("66");
                break;

        }
    }
}
