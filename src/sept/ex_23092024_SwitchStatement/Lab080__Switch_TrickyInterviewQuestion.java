package sept.ex_23092024_SwitchStatement;

public class Lab080__Switch_TrickyInterviewQuestion {
    public static void main(String[] args) {
        int a = 11;//simply giving for confusing purpose
        switch (-1) {
            default:
                System.out.println("default");
                break;
            case -1://switch(-1) match with -1
                System.out.println("10");
                break;
            case 9:
                System.out.println("10");
                break;
        }
    }
}
