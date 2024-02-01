import java.util.Scanner;
public class Temperature{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        double x = sc.nextInt();
        double f = 32+(x*9/5);
        System.out.printf("%.2f",f);
    }
}