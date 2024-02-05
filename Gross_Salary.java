import java.util.Scanner;
public class Salary{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        double da = 0;
        double hra = 0;
        double gs = 0;
        if(x<=10000)
        {
             da = (80*x)/100;
             hra = (20*x)/100;
             gs = x+da+hra;
        }
        else if(x<=20000)
        {
             da = (90*x)/100;
             hra = (25*x)/100;
             gs = x+da+hra;
        }
        else if(x>20000)
        {
             da = (95*x)/100;
             hra = (30*x)/100;
             gs = x+da+hra;
        }
        System.out.printf("%.2f",gs);
    }
}