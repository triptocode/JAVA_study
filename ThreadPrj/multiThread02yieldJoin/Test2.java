package multiThread02yieldJoin;

public class Test2 {
    public static void main(String[] args) throws InterruptedException {

        Thread t1 = new MyThread2();
        t1.start();

        Thread t2 = new MyThread2();
        t2.start();

// join()을 통해 t1,t22 쓰레드가 종료될때까지 기다렸다가 main가 출력됨  / join의 하단코드가 없다면 main이 먼저출력되기도 하고 main, t1,t2 순서를 예측 불가능
        t1.join();
        t2.join();

        System.out.println("main");
    }
}
