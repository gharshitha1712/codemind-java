import java.util.Scanner;
public class Kmph{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        double x = sc.nextInt();
        double z = ((x*5)/18);
        System.out.printf("%.2f",z);
    }
}