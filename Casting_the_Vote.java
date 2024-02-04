import java.util.Scanner;
public class Age{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        if(x>=18)
        {
            System.out.print("YES");
        }
        else{
            System.out.print("NO");
        }
    }
}