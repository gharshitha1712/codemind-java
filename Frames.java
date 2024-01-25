import java.util.Scanner;
public class Frames{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();
        int a = (2*(x+y))*z;
        System.out.printf("%d",a);
    }
}