package sept.ex_23092024_SwitchStatement;

public class Lab077_Lab083_Switch_MultipleCasesTogether_JDK13Afterwards {
    public static void main(String[] args) {
        int itemcode =006;
        switch(itemcode){
            case 001,002,003://we can use multiple cases
                System.out.println("All of them are electronic gadget");
                break;
            case 004,005,007:
                System.out.println("this is Mech");
                break;
            default:
                System.out.println("None");
                break;
        }
    }
}
