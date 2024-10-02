package sept.ex_23092024_SwitchStatement;

public class Lab089_Switch_Question {
    public static void main(String[] args) {
        char ch='A';
        switch(ch){
            case 'A'+1://if we use case 'A' it will give error
                System.out.println("A");
                break;
            case 65:
                System.out.println("65");
                break;
        }
    }
}
