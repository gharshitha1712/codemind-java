import java.util.Scanner;
public class Investment{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        if(x>=2*y)
        {
            System.out.print("YES");
        }
        else{
            System.out.print("NO");
        }
    }
}