import java.util.*;

public class fibonacci{

    public int fibonacci(int n){
        return n<=1? n : fibonacci(n-1) + fibonacci(n-2); // where we are getting the n-th fibonacci number in the series
    }

    public static void main(String[] args) {
                
        fibonacci f = new fibonacci();
        System.out.println(f.fibonacci(4));
}
}