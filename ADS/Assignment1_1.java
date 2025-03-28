package ADS;

import java.util.Scanner;

public class Assignment1_1 {
    public static int findMin(int[] arr) {
            int min = arr[0];
            for (int num : arr) {
                if (num < min) {
                    min = num;
                }
            }
            return min;
        }

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int n = scanner.nextInt();
            int[] numbers = new int[n];

            for (int i = 0; i < n; i++) {
                numbers[i] = scanner.nextInt();
            }

            System.out.println(findMin(numbers));
            scanner.close();
        }
    }
