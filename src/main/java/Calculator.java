public class Calculator {

    public Calculator() {

    }

    public int factorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Cannot factorial negative number");
        }
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * factorial(n - 1);

    }

    public int binomialCoefficient(int n, int k) {
        if (n < 0 || k < 0) {
            throw new IllegalArgumentException("Cannot binomial coefficient negative number");
        }
        if (k > n) {
            throw new IllegalArgumentException("Subset size cannot exceed the set size");
        }
        int result = 1;
        for (int i = 1; i <= k; i++) {
            result = result * (n - i + 1) / i;
        }

        return result;
    }
}
