public class HomeWork1_2 {

    public static void main(String[] args) {
        int a = 637;

        System.out.println(a);

        // 10 -> 16

        System.out.println(637 / 16);   //39
        System.out.println(637 % 16);           //13
        System.out.println();

        System.out.println(39 / 16);   //2
        System.out.println(39 % 16);           //7
        System.out.println();

        System.out.println(2 / 16);   //0
        System.out.println(2 % 16);           //2
        System.out.println();

        int a16 = 0x27d;
        System.out.println("Result 637 to (10 -> 16) = " + a16);

//       // 16 -> 10
        System.out.println("Result (16 -> 10) = " + (2*Math.pow(16, 2) + 7*Math.pow(16, 1) + 13*Math.pow(16, 0)));
        System.out.println();
//
//       // 10 -> 16 by Java
        System.out.println("Result 637 to (10 -> 16) by Java = " + Integer.toHexString(a));


    }
}
