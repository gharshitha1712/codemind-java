import java.util.*;
public class Bill{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        String b = sc.nextLine();
        int  c = sc.nextInt();
        double amount = 0;
        if(c<=199){
            amount = 1.20*c;
        }
        else if(c>=200 && c<400){
            amount = 1.50*c;
        }
        else if(c>=400 && c<600){
            amount = 1.80*c;
        }
        else if(c>=600){
            amount = 2.00*c;
        }
        double sur = 0;
        if(amount >400){
            sur = 0.15*amount;
        }
        else{
            sur = 100;
        }
        double total = sur + amount;
        System.out.printf("%.2f",total);
        
    }
}
