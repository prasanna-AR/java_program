// Write a program that takes a student's marks (0-100) and prints the corresponding grade:
import java.util.Scanner;
public class exa_4 {
    public static void main(String[] args)
    {
        Scanner obj = new Scanner(System.in);
        int i = obj.nextInt();
        int j= i/10;
        switch (j)
        {
            case 9 :
                System.out.println("90-100 : A");
                break;
            case 8 :
                System.out.println("80-89 : B");
                break;
            case 7:
                System.out.println("Grade: C");
                break;
            case 6:
                System.out.println("Grade: D");
                break;
            default: // Covers marks below 60
                System.out.println("Grade: F");
                break;
        }
    }
}
