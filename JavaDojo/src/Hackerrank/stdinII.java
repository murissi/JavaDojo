package Hackerrank;

import java.util.Scanner;

public class stdinII {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int myInt = sc.nextInt();
        double myDouble = sc.nextDouble();
        sc.nextLine();
        String myString = sc.nextLine();

        System.out.printf("" +
                "String: %s%n" +
                "Double: " + myDouble +
                "Int: %d%n", myString, myInt);


        sc.close();
    }
}
