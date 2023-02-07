package logicalprogram;

public class Perfectnumber {
    static boolean isPerfect(int number) {
        // To store sum of divisors
        int divisorsum = 0;
        // Find all divisors and add them
        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                System.out.println(i + " ");
                divisorsum = divisorsum + i;
            }
        }
        if (divisorsum == number) {
            return true;
        } else
            return false;
    }
    public static void main(String[] args) {
        int number = 4;
        boolean check = isPerfect(6);
        if (check == true)
            System.out.println(number + " is a perfect number");
        else {
            System.out.println(number + " Not a perfect number");
        }
    }
}
