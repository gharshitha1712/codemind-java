import java.util.*;
public class Car{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i=0;i<t;i++)
        {
            int x1 = sc.nextInt();
            int x2 = sc.nextInt();
            int y1 = sc.nextInt();
            int y2 = sc.nextInt();
            double a = y1/(double) x1;
            double b = y2/(double) x2;
            if(a<b)
            {
                System.out.println("-1");
            }
            else if(a>b)
            {
                System.out.println("1");
            }
            else
            {
                System.out.println("0");
            }
        }
    }
}


