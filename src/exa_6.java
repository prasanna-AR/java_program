// Currency Converter
//Write a program that converts an amount from one currency to another based on user input. Example currencies:
//
//1: USD to INR
//2: INR to USD
//3: USD to EUR
//4: EUR to INR
import java.util.Scanner;
public class exa_6 {
    public static void main(String[] args)
    {
        Scanner obj =new Scanner(System.in);
        int a = obj.nextInt();
        switch (a)
        {
            case 1:
                System.out.println("USD TO INR");
                break;
            case 2:
                System.out.println("INR TO USD");
                break;
            case 3:
                System.out.println("USD TO EUR");
                break;
            case 4:
                System.out.println("EUR TO INR");
                break;
            default:
                break;
        }
    }
}
