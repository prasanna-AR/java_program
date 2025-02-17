// Write a program that takes a number (1-7) as input and prints the corresponding day of the week using a switch-case statement.

public class exa_1 {
    public static void main(String [] args)
    {
        int i;
        for(i=1;i<=7;i++)
        {
            switch(i)
            {
                case (1):
                    System.out.println("monday");
                    break;
                case (2):
                    System.out.println("tuesday");
                    break;
                case (3):
                    System.out.println("wednesday");
                    break;
                case (4):
                    System.out.println("thursday");
                    break;
                case (5):
                    System.out.println("friday");
                    break;
                case (6):
                    System.out.println("saturday");
                    break;
                case (7):
                    System.out.println("sunday");
                    break;
            }
        }
    }
}
/*
output:
monday
tuesday
wednesday
thursday
friday
saturday
sunday
 */