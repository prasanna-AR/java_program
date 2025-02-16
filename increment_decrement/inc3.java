public class inc3 {
    public static void main(String[] args)
    {
        int x=5,y=5,z;
        x=++x;
        y=--y;
        z=x++ + y--;
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
    }
}
/*
output:
x:7
y:3
z:10
 */