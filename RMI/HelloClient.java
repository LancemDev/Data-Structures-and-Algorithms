package RMI;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class HelloClient {
    public static void main(String[] args) {
        try {
            Registry registry = LocateRegistry.getRegistry("localhost", 1099);
            HelloInterface helloObj = (HelloInterface) registry.lookup("HelloServer");
            String message = helloObj.sayHello();
            System.out.println("Response from server: " + message);
        } catch (Exception e) {
            System.err.println("Client exception: " + e.toString());
            e.printStackTrace();
        }
    }
}
