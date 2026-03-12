import java.util.Scanner;

public class Run_Debug{
    public static void main (String[] args) {
    Scanner scanner = new Scanner (System.in);
        double numerator, denominator, result;

        System.out.print ("Enter Numberator: ");
        numerator = scanner.nextInt ();
        System.out.print ("Enter Denominator");
        denominator = scanner.nextInt ();
        System.out.println ();

        result = numerator / denominator;

        System.out.println (numerator + "/" + denominator + " = " + result);
        scanner.close();
    }
}