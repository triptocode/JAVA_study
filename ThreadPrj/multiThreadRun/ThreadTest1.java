package multiThreadRun;

import multiThreadRun.MyThread1;

public class ThreadTest1{
    public static void main(String args[]){
        Thread t1 = new MyThread1();
        t1.start();
        Thread t2 = new MyThread1();
        t2.start();
        System.out.println("main");
    }
}
