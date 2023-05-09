public class factorial{
    public int factorial(int n){
        return n==1? 1 : n * factorial(n-1);
    }

    public static void main(String[] args) {
        
        factorial f = new factorial();
        System.out.println(f.factorial(4));
    }
}