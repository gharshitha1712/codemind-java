import java.util.Scanner;
public class Count {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); 
        int digitCount = String.valueOf(n).length();
        System.out.println( + digitCount);
    }
}
