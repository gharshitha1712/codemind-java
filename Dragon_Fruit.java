import java.util.Scanner;
public class Dragon{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        if(x%2==0&&x!=2)
        {
            System.out.print("YES");
        }
        else{
            System.out.print("NO");
        }
    }
}