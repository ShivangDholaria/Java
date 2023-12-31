import java.util.Scanner;

public class EuclidGCD2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Enter 2 numbers");
        int a = s.nextInt();
        int b = s.nextInt();
        int tmp1 = a, tmp2 = b;

        while (b != 0) {
            if(a > b)
                a -=b;
            else
                b -= a;
        }
        System.out.printf("GCD of %d and %d is %d", tmp1, tmp2, a);
        s.close();
    }
}
