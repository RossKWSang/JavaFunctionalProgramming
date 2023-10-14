package functional.ch04;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
// Functional Interface -> Consumer(먹보)

public class Chapter4Section2 {
    public static void main(String[] args) {
        Consumer<String> myStringConsumer = (String str) -> {
            System.out.println(str);
        };

        // myStringConsumer.accept("hello world");

        List<Integer> integerInputs = Arrays.asList(2, 3, 4);
        Consumer<Integer> myIntegerProcessor = (Integer x) -> {
            System.out.println("Processing integer " + x);
        };
        process(integerInputs, myIntegerProcessor);
    }

    public static <T> void process(List<T> inputs, Consumer<T> processor) {
        for (T input : inputs) {
            processor.accept(input);
        }
    }
}
