import java.util.Scanner;
public class Height{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        float x = sc.nextFloat();
        if(x<150)
        {
            System.out.print("Person is Dwarf.");
        }
        else if(x>150&&x<=165)
        {
            System.out.print("Person is average heighted.");
        }
        else if(x>165&&x<=195)
        {
            System.out.print("Person is taller.");
        }
        else
        {
            System.out.print("Abnormal height.");
        }
    }
}