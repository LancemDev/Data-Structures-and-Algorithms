import java.util.*;

public class factorial_using_for_loop {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Enter the number: ");
            int num = scanner.nextInt();
            int fact=1;

            for(int i=1; i<=num; i++){
                fact=fact*i;
            }
            System.out.println("Factorial of the number: " + fact);
        }
    }
}
