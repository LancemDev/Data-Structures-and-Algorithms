package Threads;

class Assignment implements Runnable {
    private String name;
    
    public Assignment(String name) {
        this.name = name;
    }
    
    @Override
    public void run() {
        System.out.println("Thread " + name + " started.");
        
        // Perform some task
        for (int i = 1; i <= 5; i++) {
            System.out.println("Thread " + name + ": " + i);
            try {
                // Sleep for 1 second so we can see the output
                Thread.sleep(1000); // Simulate some time-consuming operation
            } catch (InterruptedException e) {
                // Catches exception if thread is interrupted and prints stack trace
                e.printStackTrace();
            }
        }
        
        System.out.println("Thread " + name + " finished.");
    }
}
