import java.util.Scanner;
public class King{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int a = (n*5)+(m*7);
        System.out.printf("%d",a);
    }
}