import java.util.Scanner;
public class Friends{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0)
        {
        int n = sc.nextInt();
        int m = sc.nextInt();
        int k = sc.nextInt();
        int a = m-k;
        if(a>n)
        {
            System.out.print("YES
");
        }
        else{
            System.out.print("NO
");
        }
        }
    }
}