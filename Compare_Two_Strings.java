import java.util.*;
public class Comp{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        String b = sc.nextLine();
        if(a.equals(b))
        {
            System.out.print("Strings are Equal");
        }
        else{
            System.out.print("Strings are not Equal");
        }
    }
}