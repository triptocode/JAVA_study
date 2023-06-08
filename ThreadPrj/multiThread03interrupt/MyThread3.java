package multiThread03interrupt;

public class MyThread3 extends Thread {
    Thread nextThd = null;
    MyThread3(String thdName) {
        super(thdName);
    }

    public void run() {
        for (int i = 0; i < 3; i++) {
            try { Thread.sleep(3000);}
            catch (InterruptedException e) {
                    System.out.println(getName() + " 테스트중...");
                    if (nextThd.isAlive()) {
                        nextThd.interrupt();
                    }
            }
        }
    }
    public void setNextThd( Thread t){
        nextThd = t;
    }
}
