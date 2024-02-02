import java.util.Scanner;
public class Circle{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        double a = 3.14*r*r;
        System.out.printf("%.2f",a);
    }
}