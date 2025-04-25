package recursion.theory;

public class FibonacciSeries {

    // Recurrence relation:
    // F(n) = F(n-1) + F(n-2)
    // F(0) = 0, F(1) = 1
    static int nthFibonacci(int n) {
        if (n < 2) {
            return n;
        }
        return nthFibonacci(n-1) + nthFibonacci(n-2);
        // It is not tail recursion.
    }

    public static void main(String[] args) {
        System.out.println(nthFibonacci(50));
    }
}
