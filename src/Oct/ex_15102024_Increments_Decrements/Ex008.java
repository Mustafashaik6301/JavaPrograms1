package Oct.ex_15102024_Increments_Decrements;

public class Ex008 {
    public static void main(String[] args) {
        int a = 1;
        int b = ++a;
        int c = ++a;
        System.out.println(a);
        System.out.println(a+c);
        System.out.println(a + ++a + ++a);
    }
}
