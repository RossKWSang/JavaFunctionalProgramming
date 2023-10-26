package functional.ch05.model;

public class Sedan extends Car{

    public Sedan(String name, String brand) {
        super(name, brand);
    }

    @Override
    public void drive() {
        System.out.println("세단을 운전하고 있습니다.");
    }
}
