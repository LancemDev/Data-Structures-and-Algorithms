import java.util.*;

public class factorial2
{
    public static void main(String []args){
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Enter the number: ");
            int num=scanner.nextInt();
            int i=1, fact=1;
            while(i<=num){
                fact=fact*i;
                i++;
            }
            System.out.println("Factorial of the number: " + fact);
        }
    }
}