// Create a simple authentication system using switch-case. The user enters a role (Admin, User, Guest), and the program displays different access permissions.
import java.util.Scanner;
public class exa_8 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("1.admin, 2.user, 3.guest, :");
        int a = obj.nextInt();
        switch (a) {
            case 1:
                System.out.println("now your in admin page");
                break;
            case 2:
                System.out.println("now your in user page");
                break;
            case 3:
                System.out.println("now your in guest page");
                break;
            default:
                break;
        }
    }
}
