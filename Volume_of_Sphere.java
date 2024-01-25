import java.util.Scanner;
public class Volume{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        double a = (3.14*4*r*r*r)/3;
        System.out.printf("%.2f",a);
    }
}