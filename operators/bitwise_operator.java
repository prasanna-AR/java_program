public class bitwise_operator {
    public static void main(String[] args)
    {
        // ~, &, |, ^;
       int a = 5,b=10;
       System.out.println("bitwise not:" +~b);
       System.out.println(a&b);
       System.out.println(a|b);
       System.out.println(a^b);
    }
}
/*
output:
bitwise not:-11
bitwise AND: 0
bitwise OR : 15
bitwise XOR: 15
 */