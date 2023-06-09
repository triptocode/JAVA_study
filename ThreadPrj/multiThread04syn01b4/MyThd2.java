package multiThread04syn01b4;

import java.beans.beancontext.BeanContextServiceProviderBeanInfo;

public class MyThd2 implements Runnable{
    Counter c;
    public MyThd2(Counter c) {this.c= c;}
    public void run(){for(int i=0; i<10000; i++) {c.decrement();}}
}
