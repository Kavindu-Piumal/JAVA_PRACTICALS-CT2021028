package Q9;
import java.util.*;

public class Money {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("ENTER dollars:-");
        double P=scanner.nextDouble();

        System.out.println("ENTER Years:-");
        double N=scanner.nextDouble();

        System.out.println("ENTER Percentage:-");
        double R=scanner.nextDouble();

        double Investment = P*Math.pow((1+(R/100)),N);

        System.out.println(" Money earned after N years :-  " + Investment);
    }
}
