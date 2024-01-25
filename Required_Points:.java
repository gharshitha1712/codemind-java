import java.util.Scanner;
public class Points{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = (y/x);
        System.out.printf("%d",z);
    }
}