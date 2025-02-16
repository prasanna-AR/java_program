public class inc_dec2 {
    public static void main(String[] args)
    {
        int x=5,y=10,z=15,a=1,b,c,d;
        a= ++x + 10 + y-- - z++;
        b= ++y + z++ + a++;
        c= z++ + x++ + 5 + y++;
        d= ++a + x++ + y + z--;
        System.out.println("a="+a+" b="+b+" c="+c+" d="+d);
    }
}
/*
output:
a=13 b=37 c=38 d=49
*/