package functional.ch05.model;

public class Van extends Car{

    public Van(String name, String brand) {
        super(name, brand);
    }

    @Override
    public void drive() {
        System.out.println("밴을 운전하고 있습니다.");
    }
}
