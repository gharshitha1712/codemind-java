import java.util.*;
public class Alpha{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int s = sc.nextInt();
        int t = sc.nextInt();
        if(h>50&&s>60&&t>100)
        {
            System.out.print("10");
        }
        else if(h>50&&s>60)
        {
            System.out.print("9");
        }
        else if(s>60&&t>100)
        {
            System.out.print("8");
        }
        else if(h>50&&t>100)
        {
            System.out.print("7");
        }
        else if(h>50||s>60||t>100)
        {
            System.out.print("6");
        }
        else
        {
            System.out.print("5");
        }
    }
}