package Uts;

public class MyUtsRound {

    public static double rounding (double num){

        num=num*100;           // 12.98934 * 100 = 1298
        num=Math.round(num);   //
        num=num / 100;

        return num;

    }
}
