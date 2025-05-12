import java.util.Scanner;

public class FibonacciTester {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Number in Sequence (0 - 46): ");
        int num = Integer.parseInt(in.nextLine());

        Fibonacci fib = new Fibonacci();

        if(num < 0 || num > 46) {
            System.out.println("Index Out of Range");
        }
        else {
            System.out.println(fib.calcFib(num));
        }  
    }
}
