public class inc_dec3 {
    public static void main(String[] args)
    {
        int x=5,y=10,z=7,a=1,b,c,d;
        a = a++ + y++ + z--;
        b= ++x + y++ + z -a;
        c= x++ + y++ +10 -z;
        d= ++y +z + a++;
        System.out.println("a="+a+" b="+b+" c="+c+" d="+d);
    }
}
/*
output:
a=19 b=5 c=22 d=38
*/
