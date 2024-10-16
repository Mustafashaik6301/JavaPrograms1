package Oct.ex_15102024_Increments_Decrements;

public class Ex011 {
    public static void main(String[] args) {
        int a = 1, b = a++, c = a++, d = ++a, e = --a;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(a+b+c);
        System.out.println(a + b++ + a++);
        System.out.println(a + ++b);
    }
}
