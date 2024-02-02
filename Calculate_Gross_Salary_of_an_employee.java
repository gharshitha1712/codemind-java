import java.util.Scanner;
public class Salary{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        double s = sc.nextDouble();
        double h = sc.nextDouble();
        double d = sc.nextDouble();
        double pf = (12*s)/100;
        double gs = s+h+d+pf;
        System.out.printf("%.2f
%.2f",pf,gs);
    }
}