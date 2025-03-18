package Q7;

import java.util.*;

public class BMI {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter your weight:- ");
        int w= scanner.nextInt();
        System.out.println("Enter your height:- ");
        int h= scanner.nextInt();

        double formula=(double) h/100.0;
        double BMI=(double) w / (formula*formula);

        System.out.println("Your BMI IS "+ BMI);

    }
}
