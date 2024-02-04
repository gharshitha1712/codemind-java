import java.util.Scanner;
public class Tickets{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if(4*a<=1000)
        {
            System.out.print("YES");
        }
        else{
            System.out.print("NO");
        }
    }
}