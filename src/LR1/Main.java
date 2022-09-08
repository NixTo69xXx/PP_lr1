package LR1;
import java.util.Scanner;

/**
 * This is my main class.
 * Here I scan N(the amount of Fibonacci numbers whose sum needs to be found)
 * and call the method FindingSum
 */
public class Main
{
    public static void main(String[] args)
    {
        System.out.print("Enter the amount of Fibonacci numbers whose sum needs to be found: ");
        Scanner scan = new Scanner(System.in);
        Fibonacci N = new Fibonacci(scan.nextInt());

        N.FindingSum();
    }

}
