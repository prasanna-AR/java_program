// Write a simple calculator using switch-case that takes two numbers and an operator (+, -, *, /) as input and performs the operation.
import java.util.Scanner;
public class exa_2 {
    public static void main(String[] args)
    {
        int i,j,a=10,b=20;
        do
        {
            Scanner obj = new Scanner(System.in);
            System.out.println("Enter the operator: +,-,*,/");
            String operator = obj.nextLine();
            switch (operator)
            {
                case "+":
                    System.out.println("add ="+(a+b));
                    break;
                case "-":
                    System.out.println("sub ="+(a-b));
                    break;
                case "*":
                    System.out.println("mul ="+(a*b));
                    break;
                case "/":
                    System.out.println("divide ="+((float)a/(float)b));
                    break;
                default :
                    break;
            }
            System.out.println("Enter 1 to continue or 0 to exit");
            j = obj.nextInt();
        }while(j==1);
    }

}
