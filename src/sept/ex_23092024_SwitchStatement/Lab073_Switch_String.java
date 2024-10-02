package sept.ex_23092024_SwitchStatement;

public class Lab073_Switch_String {
    public static void main(String[] args) {
        //web automation
        //I will ask user which browser you want me to run the code
        //chrome -> execute chrome
        //firefox -> execute on firefox
        //edge -> edge cases

        String browser="chrome";
        switch(browser){
            default://we can place default whereever we can place
                System.out.println("I don't have idea about the browser");
                break;
            case "chrome":
                System.out.println("starting the chrome browser");
                break;
            case "firefox":
                System.out.println("starting the firefox browser");
                break;
            case "edge":
                System.out.println("starting the edge browser");
                break;

        }
    }
}
