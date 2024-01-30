import java.util.Scanner;
public class Height{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        double y = 2.54*x;
        System.out.printf("%.2f",y);
    }
}