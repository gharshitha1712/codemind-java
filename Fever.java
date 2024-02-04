import java.util.Scanner;
public class Fever{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        if(x>98)
        {
            System.out.print("YES");
        }
        else{
            System.out.print("NO");
        }
    }
}