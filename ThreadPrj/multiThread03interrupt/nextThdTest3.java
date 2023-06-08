package multiThread03interrupt;

public class nextThdTest3 {
    public static void main(String[] args) {
        MyThread3 my_thd1 = new MyThread3("쓰레드명_A");
        MyThread3 my_thd2 = new MyThread3("쓰레드명_B");
        MyThread3 my_thd3 = new MyThread3("쓰레드명_C");

        my_thd1.setNextThd(my_thd2);
        my_thd2.setNextThd(my_thd3);
        my_thd3.setNextThd(my_thd1);

        my_thd1.start();
        my_thd2.start();
        my_thd3.start();

        try { my_thd1.interrupt();
            my_thd1.join(); my_thd2.join(); my_thd3.join();
        }
        catch (InterruptedException e){System.out.println(e);}

        System.out.println("쓰레드 main");
    }
}
