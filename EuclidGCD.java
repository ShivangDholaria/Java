import java.util.Scanner;

public class EuclidGCD {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Enter 2 numbers");
        int a = s.nextInt();
        int b = s.nextInt();

        while (b != 0) {
            if(a > b)
                a -=b;
            else
                b -= a;
        }
        System.out.println("GCD of the given 2 number is " + a);
        s.close();
    }
}
