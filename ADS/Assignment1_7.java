package ADS;

import java.util.Scanner;

public class Assignment1_7 {
    public static void printReverse(int n, Scanner scanner) {
        if (n == 0) return;
        int num = scanner.nextInt();
        printReverse(n - 1, scanner);
        System.out.print(num + " ");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        printReverse(n, scanner);
        scanner.close();
    }
}
