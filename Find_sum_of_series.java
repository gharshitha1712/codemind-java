import java.util.*;
public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double s=0;
        for(double i=1;i<=n;i++){
            s+=(1/i);
        }
        System.out.printf("%.2f",s);
    }
}