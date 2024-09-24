package sept.ex_18092024_Type_Casting;

public class Lab041__TypeCasting {
    public static void main(String[] args) {
        //Widening
        byte b = 10;
        int a = b; //Valid - Implicit Casting- JVM
        int a1 = (int)b; //Valid - Explicit Casting- JVM

        //Narrowing
        int val = 300;
        //byte b1 = val; //Invalid - Implicit Casting- JVM
        byte b2 = (byte)val; //Invalid - Explicit Casting- Loss of data

        //Narrowing
        int val1 = 300; // it will covert into binary format then it will take only 32 bits so it  is providing 44

        //byte b3 = val1; //Invalid - Implicit Casting- JVM
        byte b4 = (byte)val1; //Invalid - Explicit Casting- Loss of data
        System.out.println(b4);
    }
}
