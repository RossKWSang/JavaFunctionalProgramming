package functional.ch05;

import functional.ch04.User;
import java.util.function.BiFunction;

public class Chapter5Section3 {
    public static void main(String[] args) {
        User user = new User(1, "Alice");
        BiFunction<Integer, String, User> userCreator = User::new;
        User charlie = userCreator.apply(3, "Charlie");
        System.out.println(charlie);
    }
}
