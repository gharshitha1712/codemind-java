import java.util.Scanner;

public class PrettyNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        while (T-- > 0) {
            int L = scanner.nextInt();
            int R = scanner.nextInt();
            int count = 0;
            for (int i = L; i <= R; i++) {
                int lastDigit = i % 10;
                if (lastDigit == 2 || lastDigit == 3 || lastDigit == 9) {
                    count++;
                }
            }
            System.out.println(count);
        }
        scanner.close();
    }
}
