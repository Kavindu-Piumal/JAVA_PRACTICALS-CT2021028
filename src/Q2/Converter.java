package Q2;
import java.util.*;

public class Converter {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter centimeter value:-");
        double centimeter = scanner.nextDouble();

        double CmtoInch = 2.54;
        double Inchtofoot = 12;

        double Cminch = centimeter/CmtoInch;
        double InchFoot = Cminch/Inchtofoot;

        System.out.println(centimeter + "to inch is : " + Cminch + " and To Foot is : " + InchFoot );
    }
}
