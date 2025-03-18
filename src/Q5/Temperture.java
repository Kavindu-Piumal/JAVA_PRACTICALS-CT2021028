package Q5;

import java.util.*;

public class Temperture {
    public static void main(String[] args) {

        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter Temperature in degrees Fahrenheit:-");
        double Fahrenheit=scanner.nextDouble();

        double celsius=((double) 5 /9)*(Fahrenheit-32);

        System.out.println(Fahrenheit +"to Celsius is:- " + celsius);
    }
}
