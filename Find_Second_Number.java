import java.util.Scanner;
public class Number{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = ((2*x)-y);
        System.out.printf("%d",z);
    }
}