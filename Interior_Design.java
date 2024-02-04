import java.util.Scanner;
public class Interior{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int x1 = sc.nextInt();
        int y1 = sc.nextInt();
        int x2 = sc.nextInt();
        int y2 = sc.nextInt();
        if(x1+y1<x2+y2)
        {
            System.out.print(x1+y1);
        }
        else{
            System.out.print(x2+y2);
        }
    }
}