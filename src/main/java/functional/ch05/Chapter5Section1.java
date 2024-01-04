package functional.ch05;

import java.util.function.BiFunction;
import java.util.function.Function;

public class Chapter5Section1 {

    public static int calculate(int x, int y, BiFunction<Integer, Integer, Integer> operator) {
        return operator.apply(x, y);
    }
    public static int add(int x, int y) {
        return x + y;
    }

    public void myMethod() {
        System.out.println(calculate(10, 3,  this::subtract));
    }

    public int subtract(int x, int y) {
        return x - y;
    }

    public static void main(String[] args) {
        Function<String, Integer> str2Int = Integer::parseInt;;
        System.out.println(str2Int.apply("20"));

        String str = "hello";
        Function<String, Boolean> isEqual = str::equals;
        System.out.println(isEqual.apply("hello"));
        System.out.println(isEqual.apply("bye"));

        System.out.println(calculate(6, 7, (x, y) -> x + y));
        System.out.println(calculate(3, 4, Chapter5Section1::add));
        System.out.println(calculate(10, 4, new Chapter5Section1()::subtract));

        Chapter5Section1 instance = new Chapter5Section1();
        instance.myMethod();
    }
}
