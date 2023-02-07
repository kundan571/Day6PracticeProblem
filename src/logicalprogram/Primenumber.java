package logicalprogram;

import java.util.Scanner;

public class Primenumber {
    public static void main(String[] args) {
        System.out.println("Enter a Number: ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int temp = 0;
        if (n == 0 || n == 1){
            System.out.println("Number is non prime");
            return;
        }
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                temp++;
            }
        }
        if (temp == 0)
            System.out.println("number is Prime: ");
        else
            System.out.println("Number is non prime");
    }
}