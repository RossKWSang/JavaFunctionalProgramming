package was.counter;

// Counter는 기본적으로 스레드이다.
public class Counter implements Runnable {

    // 스레드는 상태값을 가지면 안된다.
    private int count = 0;

    public void increment() {
        count++;
    }

    public void decrement() {
        count--;
    }

    public int getValue() {
        return count;
    }

    @Override
    public void run() {
        this.increment();
        System.out.println("Value for Thread After increment " + Thread.currentThread().getName() + " " + this.getValue());
        this.decrement();
        System.out.println("Value for Thread at last " + Thread.currentThread().getName() + " " + this.getValue());
    }
}