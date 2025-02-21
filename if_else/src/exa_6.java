// Ask the user for their username and password. If they match the stored values, print "Login successful," otherwise, print "Invalid credentials."
import java.util.Objects;
import java.util.Scanner;
public class exa_6 {
    public static void main(String[] args)
    {
        Scanner obj      = new Scanner(System.in);
        System.out.println("ENTER THE USER_NAME : ");
        String user_name = obj.next();
        System.out.println("ENTER THE PASSWORD : ");
        int password     = obj.nextInt();
        if(Objects.equals(user_name, "savanna") && password == 2110)
        {
            System.out.println("login successful");
        }
        else
            System.out.println("invalid credentials");

    }
}
/*
output :
ENTER THE USER_NAME :
savanna
ENTER THE PASSWORD :
2110
login successful
 */
