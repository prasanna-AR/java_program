//Check whether a given triangle is equilateral, isosceles, or scalene based on user input for three sides.
import java.util.Scanner;
public class exa_10 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("ENTER THE THREE VALUES FOR TRIANGLE :");
        int a = obj.nextInt();
        int b = obj.nextInt();
        int c = obj.nextInt();
        if(a==b && b==c)
            System.out.println("triangle is equal ");
        else
            System.out.println("triangle is not equal ");
    }
}
/*
output:
ENTER THE THREE VALUES FOR TRIANGLE :
3
3
3
triangle is equal 
 */