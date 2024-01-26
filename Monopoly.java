import java.util.Scanner;
public class Monopoly{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0)
        {
        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();
        if(x==y && y==z && z==x)
        {
            System.out.printf("NO
");
        }
        else if((x+y)<z || (y+z)<x || (z+x)<y)
        {
            System.out.printf("YES
");
        }
        else
        {
            System.out.printf("NO
");
        }
        }
    }
}