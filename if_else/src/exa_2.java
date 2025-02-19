//Ask the user to enter a number and check if it is even or odd
import java.util.Scanner;
public class exa_2 {
    public static void main(String[] args)
    {
        Scanner obj = new Scanner(System.in);
        System.out.println("enter a number and check if it is even or odd : ");
        int a = obj.nextInt();
        if (a%2==0)
            System.out.println("even number");
        else
            System.out.println("odd number");
    }
}
