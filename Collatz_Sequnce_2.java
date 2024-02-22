import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(); 
        int b = sc.nextInt(); 

        int maxChainLength = 0;
        int numberWithMaxChainLength = 0;

        for (int i = a; i <= b; i++) {
            int chainLength = collatzChainLength(i);
            if (chainLength > maxChainLength) {
                maxChainLength = chainLength;
                numberWithMaxChainLength = i;
            }
        }
        System.out.println(numberWithMaxChainLength);
    }

    public static int collatzChainLength(int N) {
        int count = 0;
        while (N != 1) {
            if (N % 2 == 0) {
                N = N / 2;
            } else {
                N = 3 * N + 1;
            }
            count++;
        }
        return count;
    }
}
