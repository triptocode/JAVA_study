package multiThread04syn01b4;

public class MyThd1 implements Runnable{
    Counter c;
    public MyThd1(Counter c){
        this.c= c;
    }
    public void run(){
        for(int i = 0; i<10000; i++) {c.increment();}
    }
}
