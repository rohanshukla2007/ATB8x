package sept.ex_23092024_SwitchStatement;

public class Lab076_Switch_SameCaseTwoTimes {
    public static void main(String[] args) {
        int a = 98;
        switch (a) {
            case 98:
                System.out.println("98");
                break;
//            case 98://we can't use same case 2 times
//                System.out.println("98");
        }
    }
}
