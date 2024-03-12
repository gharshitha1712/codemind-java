import java.util.Scanner;

public class FancyNumber {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String number = scanner.nextLine();

        if (number.length() != 10) {
            System.out.println("-1");
            return;
        }

        if (isFancy(number)) {
            System.out.println("FANCY NUMBER");
        } else {
            System.out.println("NOT A FANCY NUMBER");
        }
    }

    public static boolean isFancy(String number) {
        return hasConsecutiveThreeDigits(number) || hasIncreasingOrDecreasingConsecutiveDigits(number) || hasRepeatedDigit(number);
    }

    public static boolean hasConsecutiveThreeDigits(String number) {
        for (int i = 0; i <= number.length() - 3; i++) {
            if (number.charAt(i) == number.charAt(i + 1) && number.charAt(i) == number.charAt(i + 2)) {
                return true;
            }
        }
        return false;
    }

    public static boolean hasIncreasingOrDecreasingConsecutiveDigits(String number) {
        for (int i = 0; i <= number.length() - 3; i++) {
            if ((number.charAt(i) + 1 == number.charAt(i + 1) && number.charAt(i + 1) + 1 == number.charAt(i + 2)) ||
                    (number.charAt(i) - 1 == number.charAt(i + 1) && number.charAt(i + 1) - 1 == number.charAt(i + 2))) {
                return true;
            }
        }
        return false;
    }

    public static boolean hasRepeatedDigit(String number) {
        for (char digit = '0'; digit <= '9'; digit++) {
            int count = 0;
            for (int i = 0; i < number.length(); i++) {
                if (number.charAt(i) == digit) {
                    count++;
                }
            }
            if (count >= 5) {
                return true;
            }
        }
        return false;
    }
}
