package sept.ex_16092024_Operators;

public class Lab027 {
    public static void main(String[] args) {
        String first_name ="Rohan";
        String last_name ="Shukla";

        //Concatenation operator +
        //+,int +int -->math
        //+,string,combine --> concat
        System.out.println(first_name + last_name);
        int a=10;
        int b=10;
        System.out.println(first_name+last_name+a+b);
        //first letter is string out takes result as string
        System.out.println(a+b+first_name+last_name);
        //first variable is number first it will add then it will concatenate
    }
}
