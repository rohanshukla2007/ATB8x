package sept.ex_25092024_Forloop;

public class Lab087_Forloop {
    public static void main(String[] args) {
     //   for (float f = 0.0f; f < 10.67; f++) {
//            System.out.println("Hi,Float -> " + f);
//        }
//        for (byte f = 0; f < 10.67; f++) {
//            System.out.println("Hi,Float -> " + f);
//        }
//            for (long i = 1; i < 10; i++) {
//                System.out.println(i);
//            } // numerical - float, int, short, byte,long, char

//            for (char c = 'a'; c <= 'z';c++){
//                System.out.println(c);
////            }
//            for (int i = 0; i > 0 ; i--) {
//                System.out.println("i");
//            }
//        int i = 10;
//        for (; i>0 ; i--) {
//            System.out.println(i);
//        }
        System.out.println("Start");

//        for (int ii = 0; ii < 10 ;ii++) {
//            System.out.println("Rohan");
//        }
//
//        System.out.println("Outside Loop");
//        for (int j = 0; j < 50 ; j++) {
//            if( j%2 == 0){
//                System.out.println(j);
//            }
//        }
        for (int i = 0; i < 50; i++) {
            System.out.println(i);
            if(i ==5){
                break;
            }
        }
        for (int i = 0; i < 10 ; i++) { // 0 to 9
            System.out.println(i);
            if(i == 5){
                continue;
            }
            System.out.println("After");
        }
        }
    }

