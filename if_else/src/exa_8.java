//Check if a given number is divisible by both 5 and 7.
import java.util.Scanner;
public class exa_8 {
    public static void main(String[] args)
    {
        Scanner obj = new Scanner(System.in);
        System.out.println("Check if a given number is divisible by both 5 and 7 : ");
        System.out.println("ENTER THE NUMBER :");
        int a = obj.nextInt();
        if(a%5==0 && a%7==0)
            System.out.println("THE GIVEN NUMBER IS DIVISIBLE BY 5 AND 7");
        else
            System.out.println("NOT DIVISIBLE BY 5 AND 7");
    }
}
/*
output :
ENTER THE NUMBER :
70
THE GIVEN NUMBER IS DIVISIBLE BY 5 AND 7
 */