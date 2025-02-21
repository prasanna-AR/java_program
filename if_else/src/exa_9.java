// Take the marks of a student and assign a grade based on the following:
import java.util.Scanner;
public class exa_9 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("ENTER THE MARK :");
        int a = obj.nextInt();
        if (a >= 90 && a <= 100)
            System.out.println("A grade");
        else if (a >= 80 && a <= 89)
            System.out.println("b grade");
        else if (a >= 70 && a <= 79)
            System.out.println("c grade");
        else if (a >= 60 && a <= 69)
            System.out.println("d grade");
        else if (a < 60)
            System.out.println("fail");

    }

}
/*
output :
ENTER THE MARK :
68
d grade
 */



