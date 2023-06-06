package yieldJoin;

public class MyThread2 extends Thread{
    @Override
    public void run() {
        for(int i=0; i<1000; i++){
            System.out.println(getName());
            Thread.yield();
        }
    }
}
