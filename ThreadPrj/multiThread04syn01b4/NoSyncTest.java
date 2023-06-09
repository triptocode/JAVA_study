package multiThread04syn01b4;

public class NoSyncTest {
    public static void main(String[] args) throws InterruptedException {
        Counter counter = new Counter();
        Thread t1 = new Thread(new MyThd1(counter));
        Thread t2 = new Thread(new MyThd2(counter));
        t1.start(); t2.start();
        t1.join(); t2.join();
        System.out.println(counter.value());
    }
}
