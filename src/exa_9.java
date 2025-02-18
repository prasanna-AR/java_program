//Write a program that takes an integer (1-12) as input and prints the corresponding month name.
import java.util.Scanner;
public class exa_9 {
    public static void main(String[] args)
    {
        Scanner obj =new Scanner(System.in);
        int a = obj.nextInt();
        switch (a)
        {
            case 1:
                System.out.println("JANUARY");
                break;
            case 2:
                System.out.println("feb");
                break;
            case 3:
                System.out.println("mar");
                break;
            case 4:
                System.out.println("apr");
                break;
            case 5:
                System.out.println("may");
                break;
            case 6:
                System.out.println("June");
                break;
            case 7:
                System.out.println("July");
                break;
            case 8:
                System.out.println("aug");
                break;
            case 9:
                System.out.println("sep");
                break;
            case 10:
                System.out.println("oct");
                break;
            case 11:
                System.out.println("nov");
                break;
            case 12:
                System.out.println("dec");
                break;
            default:
                System.out.println("not a month");
                break;
        }
    }
}
