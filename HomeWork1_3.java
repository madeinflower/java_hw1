public class HomeWork1_3 {
    public static void main (String[] args) {

        int a = 637;

        // 10 -> 2

        System.out.println(637 / 2);    //318
        System.out.println(637 % 2);            //1
        System.out.println();

        System.out.println(318 / 2);    //159
        System.out.println(1 % 2);            //1
        System.out.println();

        System.out.println(159 / 2);    //79
        System.out.println(159 % 2);            //1
        System.out.println();

        System.out.println(79 / 2);    //39
        System.out.println(79 % 2);            //1
        System.out.println();

        System.out.println(39 / 2);    //19
        System.out.println(39 % 2);            //1
        System.out.println();

        System.out.println(19 / 2);    //9
        System.out.println(19 % 2);            //1
        System.out.println();

        System.out.println(9 / 2);    //4
        System.out.println(9 % 2);            //1
        System.out.println();

        System.out.println(4 / 2);    //2
        System.out.println(4 % 2);            //0
        System.out.println();

        System.out.println(2 / 2);    //1
        System.out.println(2 % 2);            //0
        System.out.println();

        System.out.println(1 / 2);    //0
        System.out.println(1 % 2);            //1
        System.out.println();

        int a2 = 0b1001111101;
        System.out.println("Result 637 to (10 -> 2) = " + a2);
//
//      // 2 -> 10
        System.out.println("Result (2 -> 10) = " +
        (1*Math.pow (2, 9) + 0*Math.pow (2, 8) + 0*Math.pow (2, 7) + 1*Math.pow(2, 6) + 1*Math.pow(2, 5) + 1*Math.pow(2, 4) + 1*Math.pow(2, 3) + 1*Math.pow(2, 2) + 0*Math.pow(2, 1) + 1*Math.pow(2, 0)));
//
//      // 10 -> 2 by Java
        System.out.println("Result (10 ->2) by Java = " + Integer.toBinaryString(a));


    }
}
