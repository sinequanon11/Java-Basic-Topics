package GamesAndPrograms;

import java.text.NumberFormat;
import java.util.Scanner;

public class MortgageCalculator {

    private static final int MONTHS_IN_A_YEAR = 12;  // this is a constant

    public static void main(String[] args) {

        // Find the monthly payment (M).  Formul:  M=P------ (üstte: i(1+i)üzeri n), (altta: (1+i)üzeri n -1)
        // principal=total price of the house
        // i=interest rate

        Scanner scanner=new Scanner(System.in);

        System.out.print("Enter the principal amount: ");
        double principal=scanner.nextDouble();

        System.out.print("Enter the annual interest rate: ");
        float annualInterestRate=scanner.nextFloat();

        System.out.print("Enter the term in years: ");
        int termInYears= scanner.nextInt();

        scanner.close();

        float montlyInterestRate = annualInterestRate / MONTHS_IN_A_YEAR;
        int numberOfPayments = termInYears*MONTHS_IN_A_YEAR;
        double monthlyPayment = principal * (montlyInterestRate *
                (Math.pow(1+montlyInterestRate,numberOfPayments))) /
                ((Math.pow(1+montlyInterestRate,numberOfPayments)) -1);

        System.out.println("Monthly Payment Round : " + Math.round(monthlyPayment));
        System.out.println("Monthly Payment Format : " + NumberFormat.getCurrencyInstance().format(monthlyPayment));

        System.out.println("Total payback amount: " +
                NumberFormat.getCurrencyInstance().format(monthlyPayment*numberOfPayments));

    }
}
