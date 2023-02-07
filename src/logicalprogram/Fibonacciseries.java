package logicalprogram;

public class Fibonacciseries {
    static void findSeries(int nthterm, int firstterm, int secondterm) {
        System.out.print(firstterm + " " + secondterm + " ");
        int counter = 0, sum;
        // find next (num - 2) terms
        while (counter < nthterm - 2) {
            sum = firstterm + secondterm;
            System.out.print(sum + " ");
            firstterm = secondterm;
            secondterm = sum;
            counter++;
        }
    }
    public static void main(String[] args) {
        int nthterm = 7, firstterm = 2, secondterm = 4;
        findSeries(nthterm, firstterm, secondterm);
    }
}
