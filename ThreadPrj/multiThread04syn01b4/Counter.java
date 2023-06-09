package multiThread04syn01b4;
public class Counter {
    private  int num = 0;
// test1 - no Sync
//    public  void  increment(){ num++;}
//    public  void  decrement(){ num--;}

// test2 - with Sync
    public synchronized void  increment(){ num++;}
    public synchronized void  decrement(){ num--;}

    public int value(){return num;}
}


