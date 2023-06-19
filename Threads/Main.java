package Threads;

public class Main {
    public static void main(String[] args) {
        // Create multiple threads
        Thread thread1 = new Thread(new Assignment("Thread 1"));
        Thread thread2 = new Thread(new Assignment("Thread 2"));
        
        // Start the threads
        thread1.start();
        thread2.start();
        
        // Wait for threads to finish
        try {
            // Wait for threads to finish
            // The join() method waits for a thread to die
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        
        System.out.println("All threads finished.");
    }
}
