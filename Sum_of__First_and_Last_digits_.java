import java.util.*;
public class Sum{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int l = n%10;
        int f = 0 ;
        while(n>0)
        {
            f = n%10;
            n/=10;
        }
        int s = f + l;
        System.out.println(s);
    }
}


