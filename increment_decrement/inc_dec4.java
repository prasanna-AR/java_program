public class inc_dec4 {
    public static void main(String[] args)
    {
        int x=5,y=10,z=15,a=1,b,c,d;
        a = x++ + y++ + --z +5;
        b = --x + y++ + x + z++;
        c = ++z + y++ + 5 + x++;
        d = x + y + z -a;
        System.out.println("a="+a+" b="+b+" c="+c+" d="+d);
    }
}
/*
output:
a=34 b=35 c=38 d=1
 */