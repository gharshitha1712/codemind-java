import java.util.Scanner;
public class Romeo{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();
        int a = x*5;
        int b = y*10;
        int c = (a+b)/z;
        System.out.printf("%d",c);
    }
}