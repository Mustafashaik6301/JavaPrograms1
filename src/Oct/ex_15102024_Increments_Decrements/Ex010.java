package Oct.ex_15102024_Increments_Decrements;

public class Ex010 {
    public static void main(String[] args) {
        int a = 101;
        int b = --a;
        int c = a--;
        System.out.println(a);
        System.out.println(a+b+c);
        System.out.println(a + --a + a--);
    }
}
