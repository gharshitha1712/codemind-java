import java.util.Scanner;
public class Handshake{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = (a*(a-1))/2;
        System.out.printf("%d",b);
    }
}