import java.util.Scanner;
public class Time{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int h = a/3600;
        int m = (a%3600)/60;
        int s = a%60;
        System.out.printf("H:M:S-%d:%d:%d", h, m, s);
    }
}