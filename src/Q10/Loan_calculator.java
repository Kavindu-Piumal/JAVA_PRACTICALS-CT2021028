package Q10;

import java.util.*;

public class Loan_calculator {
    public static void main(String[] args) {

        int monthsinyear=12;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Loan amount:-");
        double loan_amount=scanner.nextDouble();

        System.out.println("annual interest rate:-");
        double annual_interest_rate=scanner.nextDouble();

        System.out.println("loan period:-");
        double loan_period=scanner.nextDouble();

        double monthlyinterestrate=annual_interest_rate/100.0/monthsinyear;
        double numberofpayments=loan_period*monthsinyear;
        double monthlypayment=(loan_amount*monthlyinterestrate)/(1-Math.pow(1/(1+monthlyinterestrate),numberofpayments));
        double totalpayment=monthlypayment*numberofpayments;

        System.out.println("Monthly interest rate is :- " + monthlyinterestrate +"%");
        System.out.println("Number of payments  is :- " + numberofpayments );
        System.out.println("Monthly Payment is :- " + monthlypayment +" rupees");
        System.out.println("Total payment is :- " + totalpayment +" rupees");



    }
}
