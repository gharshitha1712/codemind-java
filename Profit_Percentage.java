import java.util.Scanner;
public class Profit{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        double p = y-x;
        double z = (p/x)*100;
        System.out.printf("%.2f",z);
    }
}