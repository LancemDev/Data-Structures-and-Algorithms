package Threads;

// Import thread class
import java.lang.Thread;

public class threads extends Thread{
    // Implementing threads
    public void run(){
        System.out.println("Thread is running");
    }
    
    public static void main(String[] args) {
        threads t1 = new threads();
        t1.start();
    }
    
}
