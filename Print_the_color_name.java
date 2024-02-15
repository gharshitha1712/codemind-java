import java.util.Scanner;
public class Color{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        char s = sc.next().charAt(0);
        if(s=='V')
        {
            System.out.print("Violet");
        }
        else if(s=='I')
        {
            System.out.print("Indigo");
        }
        else if(s=='B')
        {
            System.out.print("Blue");
        }
        else if(s=='G')
        {
            System.out.print("Green");
        }
        else if(s=='Y')
        {
            System.out.print("Yellow");
        }
        else if(s=='O')
        {
            System.out.print("Orange");
        }
        else if(s=='R')
        {
            System.out.print("Red");
        }
        else
        {
            System.out.print("-1");
        }
    }
}