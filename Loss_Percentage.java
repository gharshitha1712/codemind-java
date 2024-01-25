import java.util.Scanner;
public class Loss{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        double l = (x - y);
        double z = (l/x)*(100);
        System.out.printf("%.2f",z);
    }
}