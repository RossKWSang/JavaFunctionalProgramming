package was;

// GET /calculate?operand1=11&operator=+&operand2=55
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        new CustomWebApplicationServer(8080).start();
        System.out.println("Aa");
    }
}