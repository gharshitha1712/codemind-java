import java.util.Scanner;
public class Home{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = 5*a;
        if(c>=b)
        {
            System.out.print("YES");
        }
        else{
            System.out.print("NO");
        }
    }
}