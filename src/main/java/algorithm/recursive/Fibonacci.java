package algorithm.recursive;

public class Fibonacci {
    public int fibonacciRecur(int num) {
        if(num == 0) return 0;
        if(num == 1) return 1;

        return fibonacciRecur(num-1) + fibonacciRecur(num-2);
    }

    public int fibonacciIter(int num) {
        int ppre = 0;
        int pre = 1;
        int current = 0;

        if(num == 0) return 0;
        if(num == 1) return 1;

        for(int i=2; i<=num; i++) {
            current = ppre + pre;
            ppre = pre;
            pre = current;
        }
        return current;
    }

    public int fibonacciMem(int num) {
        int[] values = new int[num + 1];

        values[0] = 0;
        values[1] = 1;

        int i;
        for (i=2; i<=num; i++) {
            values[i] = values[i-1] + values[i-2];
        }

        return values[i-1];
    }

    public static void main(String[] args) {
        Fibonacci fibonacci = new Fibonacci();
        int sum = fibonacci.fibonacciRecur(6);
        System.out.println(sum);
        sum = fibonacci.fibonacciIter(6);
        System.out.println(sum);
        sum = fibonacci.fibonacciMem(6);
        System.out.println(sum);
    }
}
