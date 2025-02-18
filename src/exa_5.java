// Number of Days in a Month
//Write a program that takes a month number (1-12) as input and prints the number of days in that month. Consider leap years for February.
import java.util.Scanner;
public class exa_5 {
    public static void main(String[] args)
    {
        Scanner obj =new Scanner(System.in);
        int a = obj.nextInt();
        switch (a)
        {
            case 1,3,5,7,8,10,12:
                System.out.println("days = 31");
                break;
            case 4,6,9,11:
                System.out.println("days = 30");
                break;
            case 2:
                System.out.println("Enter the year:");
                a= obj.nextInt();
                if(a%4==0)
                    System.out.println("leap year");
                else
                    System.out.println("not a leap year");
                break;
            default:
                break;
        }

    }
}
