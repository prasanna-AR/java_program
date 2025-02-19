// Take an age as input and determine if the person is a minor (under 18), an adult (18-60), or a senior citizen (above 60).
import java.util.Scanner;
public class exa_3 {
    public static void main(String[] args)
    {
        Scanner obj = new Scanner(System.in);
        System.out.println("Take an age as input :");
        int a = obj.nextInt();
        if(a<18)
            System.out.println("minor");
        if(a>=18 && a<=60 )
            System.out.println("adult");
        if(a>60)
            System.out.println("senior citizen");
    }

}
