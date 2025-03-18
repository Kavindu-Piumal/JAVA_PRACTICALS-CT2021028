package Q4;

import java.util.*;

public class Calories {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter Your Body Weight:-");
        double bodyweight=scanner.nextDouble();

        double calories=bodyweight*19;

        System.out.println("A Person needs "+calories +" Calories for his "+ bodyweight +" KG Body weight");
    }
}
