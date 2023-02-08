package logicalprogram;


import java.util.Scanner;

public class Stopwatch {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        long start, end;
        double elapsedtime;
        System.out.println("Enter any character to start the timer: ");
        char x = scanner.next().charAt(0);
        start = System.currentTimeMillis();
        System.out.println("Enter any character to stop the timer: ");
        char y = scanner.next().charAt(0);
        end = System.currentTimeMillis();
        elapsedtime = (end - start)/1000.0;
        System.out.println(elapsedtime);
    }

}