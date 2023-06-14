package Threads;

import java.lang.Runnable;

public class thread implements Runnable {
    public static void main(String[] args) {
        thread obj = new thread();
        Thread tobj = new Thread(obj);
        tobj.start();
    }
    public void run(){
        System.out.println("Thread is running");
    } 

}
