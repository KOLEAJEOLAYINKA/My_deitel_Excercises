package Chapter5;
//5.13 (The Sum of a Series) Find the summation of the sequence of numbers 1, 2, 3 … n, where
//        n ranges from 1 to 100. Use type long . Display the results in a tabular format that shows n and the
//        corresponding sum. If this were a product instead of a sum, what difficulty might you encounter
//        with the variable that accumulates the product?
public class TheSumOfASeries {
    public static void main(String[] args) {
        long sum = 0;
        System.out.printf("%s%4s%n", "NUMBER", "SUM");
        for (long i = 1; i <= 100; i++) {
            sum = sum + i;
            System.out.printf("%d%8d", i, sum);
            System.out.println();

        }
    }
}
