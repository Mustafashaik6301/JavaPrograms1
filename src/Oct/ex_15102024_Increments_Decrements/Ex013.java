package Oct.ex_15102024_Increments_Decrements;

public class Ex013 {
    public static void main(String[] args) {
        int a = 11, b = a++, c = a++, d = ++a, e = --a;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(a+b+c+d+e);
        System.out.println(a + b++ + e--);
        System.out.println(a + --b - c--);
        System.out.println(a + b+++ c--);






    }
}
