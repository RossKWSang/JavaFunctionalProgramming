package functional.ch04;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiConsumer;

public class Chapter4Section3 {
    public static void main(String[] args) {
        BiConsumer<Integer, Double> myDoubleProcessor =
                (Integer index, Double input) -> System.out.println("Processing " + index + " at index " + input);

        List<Double> inputs = Arrays.asList(1.1, 2.2, 3.3);
        process(inputs, myDoubleProcessor);
    }

    public static <T> void process(List<T> input, BiConsumer<Integer, T> processor) {
        for (int i=0; i < input.size(); i++) {
            processor.accept(i, input.get(i));
        }
    }
}
