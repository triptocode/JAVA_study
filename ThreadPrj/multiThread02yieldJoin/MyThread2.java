package multiThread02yieldJoin;

public class MyThread2 extends Thread{
    @Override
    public void run() {
        for(int i=0; i<5; i++){
            System.out.println(getName());

            Thread.yield();
        }
    }
}
