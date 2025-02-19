
//Write a program to check whether a character entered by the user is a vowel or consonant.
import java.util.Scanner;
public class exa_5 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("To check whether a character is a vowel or consonant : ");
        char a = obj.next().charAt(0);
        if (a == 'a' || a == 'e' || a == 'i' || a == 'o' || a == 'u')
            System.out.println("vowel");
        else
            System.out.println("consonant");
    }


}
