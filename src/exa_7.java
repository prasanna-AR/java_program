// Even or Odd using Switch
//Write a program that checks if a number is even or odd using switch-case

import java.util.Scanner;
public class exa_7 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int a = obj.nextInt();
        int check;
        switch (a % 2) {
            case 0:
                System.out.println("even");
                break;
            case 1:
                System.out.println("odd");
                break;
            default:
                break;
        }
    }

}
