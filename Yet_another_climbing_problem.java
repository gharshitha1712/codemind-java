import java.util.*;
public class Alpha{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int a = 0;
        for(int i=0;i<t;i++)
        {
            int x =sc.nextInt();
            int y = sc.nextInt();
            if(x%y==0)
            {
                a=x/y;
            }
            else if(x<y)
            {
                a=x;
            }
            else
            {
                a=(int)(x/y)+(x%y);
            }
            System.out.printf("%d
",a);
        }
    }
}