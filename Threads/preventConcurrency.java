package Threads;



public class preventConcurrency extends Thread{
    // Trying to prevent concurrency problem by using isAlive() function
    public int amount = 10000;

    public static void main(String[] args) {
        preventConcurrency obj = new preventConcurrency();
        obj.start();
        while(obj.isAlive()){
            System.out.println("Waiting for thread to complete");
        }
        System.out.println("Total amount left: " + obj.amount);
        obj.amount ++;
        System.out.println("Total amount left: " + obj.amount);
    }
    public void run(){
        amount ++;
    }   
}
