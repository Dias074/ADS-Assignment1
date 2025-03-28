package ADS;

import java.util.Scanner;

public class Assignment1_2 {
    public static double findAverage(int[] arr) {
            int sum = 0;
            for (int num : arr) {
                sum += num;
            }
            return (double) sum / arr.length;
        }

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int n = scanner.nextInt();
            int[] numbers = new int[n];

            for (int i = 0; i < n; i++) {
                numbers[i] = scanner.nextInt();
            }

            System.out.println(findAverage(numbers));
            scanner.close();
        }
    }

