import java.util.Scanner;
public class Rain{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        if(x<3)
        {
            System.out.print("LIGHT");
        }
        else if(x>=3&&x<7)
        {
            System.out.print("MODERATE");
        }
        else if(x>=7)
        {
            System.out.print("HEAVY");
        }
    }
}