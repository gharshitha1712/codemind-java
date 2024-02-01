import java.util.Scanner;
public class Operations{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = a+b;
        int d = a-b;
        int e = a*b;
        int f = a/b;
        int g = a%b;
        System.out.printf("Sum:%d
",c);
        System.out.printf("Difference:%d
",d);
        System.out.printf("Product:%d
",e);
        System.out.printf("Quotient:%d
",f);
        System.out.printf("Remainder:%d",g);
    }
}