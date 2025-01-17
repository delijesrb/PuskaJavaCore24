package rs.srb.tre;

import java.util.Scanner;

/**
 * <li>Operatori
 * </li>
 */

public class ArithmeticDemo {
    public static void main(String[] args) {
        System.out.println("Enter first number");
        int number = new Scanner(System.in).nextInt();
        System.out.println("Enter second number");
        int number2 = new Scanner(System.in).nextInt();
        int sum = number2 + number;
        System.out.println(sum);
        int substraction = number - number2;
        System.out.println(substraction);
        int product = number * number2;
        System.out.println(product);
        int dev = number / number2;
        System.out.println(dev);
        int mod = number % number2;
        System.out.println(mod);


    }
}
