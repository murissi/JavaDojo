package Hackerrank;

import java.util.Scanner;

public class intLeitura {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("type 3 int: ");
        int n1, n2,n3;
        n1 = sc.nextInt();
        n2 = sc.nextInt();
        n3 = sc.nextInt();

        System.out.printf("%d%n%d%n%d%n",n1,n2,n3);
        sc.close();
    }
}
