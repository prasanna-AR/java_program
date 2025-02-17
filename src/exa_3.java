// Write a program that takes a character as input and determines whether it is a vowel (a, e, i, o, u) or a consonant using switch-case.
import java.util.Scanner;
public class exa_3 {
    public static void main(String[] args)
    {
        Scanner obj = new Scanner(System.in);
        String vowel = obj.next();
        switch (vowel)
        {
            case "a","e","i","o","u":
                System.out.println("vowel");
                break;
            default :
                System.out.println("not a vowel");
                break;
        }
    }
}
