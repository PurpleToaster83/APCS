public class Fibonacci {
    public int calcFib(int num) {
        if(num == 0) {
            return 0;
        }
        else if(num == 1) {
            return 1;
        }

        return calcFib(num - 1) + calcFib(num - 2);
    }
}
