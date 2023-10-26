package functional.ch05.model;

public class Suv extends Car{
    public Suv(String name, String brand) {
        super(name, brand);
    }

    @Override
    public void drive() {
        System.out.println("SUV를 운전하고 있습니다.");
    }
}
