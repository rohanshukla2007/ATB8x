package sept.ex_23092024_SwitchStatement;

public class Lab072_Switch {
    public static void main(String[] args) {
        int day = 5;
        switch (day) {
            case 1:
                System.out.println("mon");
            case 2:
                System.out.println("tue");
            case 3:
                System.out.println("wed");
            case 4:
                System.out.println("thu");
            case 5:
                System.out.println("fri");

            case 6:
                System.out.println("sat");

            case 7:
                System.out.println("sun");

            default:
                System.out.println("no idea ,that day is");
                break;
        }
        System.out.println("end of the loop");
    }
}
