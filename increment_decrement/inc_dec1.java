public class inc_dec1 {
    public static void main(String[] args)
    {
        int x=10,y=15,z=5,a=1,b,c;
        a=++x + y++ + z--;
        b=--x + a++ +10 + y++;
        c=x++ + y++ + z--;
        System.out.println("a="+a+" b="+b+" c="+c);
    }
}
/*
output:
a=32 b=67 c=31

 */