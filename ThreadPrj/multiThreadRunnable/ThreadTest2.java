package multiThreadRunnable;

public class ThreadTest2 {
    public  static void main(String[] args){
        Thread t1 = new Thread(new MyThread2(), "thrd0");
        t1.start();
        Thread t2 = new Thread(new MyThread2(), "thrd1");
        t2.start();
        System.out.println("main");
    }
}
