import java.util.Scanner;
public class Subscription{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        if(x<40)
        {
            System.out.print("NO");
        }
        else{
            System.out.print("YES");
        }
    }
}