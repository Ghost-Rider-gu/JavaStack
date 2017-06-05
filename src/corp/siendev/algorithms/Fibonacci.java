package corp.siendev.algorithms;

/**
 * Fibonacci's numbers
 */
public class Fibonacci
{
    /**
     * Check passed parameter
     *
     * @param fibo our number
     */
    private void checkParam(int fibo)
    {
        if(fibo < 0) {
           throw new IllegalArgumentException("Parameter cannot be negative!");
        }
    }

    /**
     * Calculate Fibonacci's number with recursive
     *
     * @param fibo parameter
     *
     * @return long
     */
    public long fibonacciRecursive(int fibo)
    {
        this.checkParam(fibo);

        if(fibo <= 1) {
            return 1;
        } else {
            return fibonacciRecursive(fibo - 1) + fibonacciRecursive(fibo - 2);
        }
    }
}
