package Q8;
import java.util.*;

public class Volume {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the p: ");
        double radius = scanner.nextDouble();


        final double PI=3.14;

        double volume=(4.0/3.0)* (PI *(radius*radius*radius));

        System.out.println("The Volume is " + volume);
    }
}
