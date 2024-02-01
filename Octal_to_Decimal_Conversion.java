import java.util.Scanner;
public class Conversion{
    public static void main(String[] args)
    {
            Scanner sc = new Scanner(System.in);
            String x = sc.next();
            int y = Integer.parseInt(x,8);
            System.out.print(y);
    }
}