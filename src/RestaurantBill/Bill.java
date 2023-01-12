package RestaurantBill;

import Uts.MyUtsRound;

import java.util.Scanner;

public class Bill {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.print("Enter the cost of the meal: ");

        double mealPrice=scan.nextDouble();

        double tax= mealPrice*0.07;
        double tip=(mealPrice+tax)*0.15;
        double totalBill=mealPrice+tax+tip;

        System.out.println( Math.round(totalBill));

        System.out.println("Cost of meal: " +  MyUtsRound.rounding(mealPrice));
        System.out.println("Tax: " + MyUtsRound.rounding(tax));
        System.out.println("Tip: " + MyUtsRound.rounding(tip));
        System.out.println("Total Bill: " + MyUtsRound.rounding(totalBill));



    }
}
