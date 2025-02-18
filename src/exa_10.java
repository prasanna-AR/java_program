// Simulate a traffic light system where the user inputs "red", "yellow", or "green", and the program outputs the corresponding action (Stop, Get Ready, Go).
import java.util.Scanner;
public class exa_10 {
    public static void main(String[] args)
    {
        Scanner obj =new Scanner(System.in);
        System.out.println("Enter the traffic light :");
        String a = obj.nextLine();
        switch (a)
        {
            case "red" :
                System.out.println("stop");
                break;
            case "yellow" :
                System.out.println("ready");
                break;
            case "green" :
                System.out.println("go");
                break;
            default:
                break;
        }

    }
}
