package Hackerrank;

public class imparPar {
    public static void main(String[] args) {
        int n = 24;

        if (n % 2 != 0) {
            System.out.println("Weird");
        } else if (n % 2 == 0) {
            if (n >= 2 && n <= 5) {
                System.out.println("Not Weird");
            } else if (n > 20) {
                System.out.println("Not Weird");
            } else {
                System.out.println("Weird");
            }

        }
    }
}