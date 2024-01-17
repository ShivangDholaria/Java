/**
 * Fibonacci series program
 */
public class Fib {
    
    public long fib(long num) {
        if(num == 1)
            return 1;
        if(num == 0)
            return 0;
        return fib(num - 1) + fib(num - 2);
    }
    
    public static void main(String[] args) {
        Fib f = new Fib();
        
        int counter = 10;

        for (int i = 0; i < counter; i++) {
            System.out.println("Fibonacci for the first " + i + " number(s) is/are " + f.fib(i));
        }
    }
}
