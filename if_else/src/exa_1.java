// Write a program to check if a number entered by the user is positive, negative, or zero.
import java.util.Scanner;
public class exa_1 {
    public static void main(String[] args)
    {
        Scanner obj = new Scanner(System.in);
        System.out.println("ENTER THE NUMBER positive, negative, or zero.: ");
        int a = obj.nextInt();
        if(a>0)
            System.out.println("positive");
        else if(0>a)
            System.out.println("negative");
        else
            System.out.println("Zero");

    }

}
