// Check if a given year is a leap year or not.
import java.util.Scanner;
public class exa_4 {
    public static void main(String[] args)
    {
        Scanner obj = new Scanner(System.in);
        System.out.println("To check year is a leap year : ");
        int a = obj.nextInt();
        if(a%4==0)
            System.out.println("leap year");
        else
            System.out.println("not a leap year");
    }
}
