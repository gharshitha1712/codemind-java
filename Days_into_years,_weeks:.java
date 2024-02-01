import java.util.Scanner;
public class Days{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = a/365;
        int c = (a%365)/7;
        System.out.printf("%d
%d",b,c);
    }
}