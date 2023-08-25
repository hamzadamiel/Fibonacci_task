import java.math.BigInteger;

public class Fibonacci {
/*FIRST TRY
    public static void main(String[] args) {
        int num = 100;
        BigInteger fib = fibbonacci(num);
        //System.out.println(fib);
    }
    public static BigInteger fibbonacci(int number){
        BigInteger f = BigInteger.ONE;

        int prev =0;
        int current = 1;
        for (int i = 1; i <= number; i++) {
           int next = prev+current;
           prev = current;
           current = next;
            System.out.println(current);
            if (current >= 0 && current <= 9) {
                f = f.multiply(new BigInteger("10"));
            } else if (current >= 10 && current <= 99) {
                f = f.multiply(new BigInteger("100"));
                ;
            } else if (current >= 10 && current <= 99) {
                f = f.multiply(new BigInteger("1000"));
            } else {
                f = f.multiply(new BigInteger("10000"));
            }
           BigInteger digit = new BigInteger(Integer.toString(current));



            f = f.add(digit);
            System.out.println(f);


        }
        return f;
    }

 */

    //Realised the output needs to be just showing the fibonacci number for n as showing the full 100 number all at once is too big
    public static void main(String[] args) {
        int n = 100;
        printFibonacci(n);
    }

    public static void printFibonacci(int n) {
        BigInteger a = BigInteger.ZERO;
        BigInteger b = BigInteger.ONE;

        System.out.println("First " + n + " Fibonacci numbers:");

        for (int i = 1; i <= n; i++) {
            System.out.println(i + ": " + a);
            BigInteger next = a.add(b);
            a = b;
            b = next;
        }
    }
}
