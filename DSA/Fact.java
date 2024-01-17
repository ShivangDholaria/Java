/**
 * Factorial program
 */
public class Fact {
    public long fact(long num) {
        if(num <= 1)
            return 1;
        return num * fact(num - 1);
    }
    
    public static void main(String[] args) {
        Fact f = new Fact();
        
        int counter = 10;

        for (int i = 0; i < counter; i++) {
            System.out.println("Factorial of " + i + " is " + f.fact(i));
        }
    }
}
