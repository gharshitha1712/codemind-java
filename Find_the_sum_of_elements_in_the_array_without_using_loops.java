import java.util.*;
public class Alpha{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        int sum = Arrays.stream(a).sum();
        System.out.println(+ sum);
    }
}