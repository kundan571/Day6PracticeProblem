package logicalprogram;

import java.util.Scanner;

public class Reversenumber {
    //method for reverse a number
    public static void reverseNumber(int number) {
        if (number < 10) {
        //prints the same number if the number is less than 10
            System.out.println(number);
            return;
        }
        else {
            System.out.print(number % 10);
            reverseNumber(number / 10);
        }
    }

    public static void main(String args[]) {
        System.out.println("Enter the number that you want to reverse: ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        System.out.println("The reverse of the given number is: ");
        //method calling
        reverseNumber(number);
    }
}