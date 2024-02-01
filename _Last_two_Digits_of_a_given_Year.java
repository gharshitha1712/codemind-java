import java.util.Scanner;
public class Year{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = n%100;
        System.out.printf("%02d",x);
    }
}